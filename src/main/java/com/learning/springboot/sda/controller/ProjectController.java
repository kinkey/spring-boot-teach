package com.learning.springboot.sda.controller;


import com.learning.springboot.sda.DTO.ProjectDTO;
import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.service.ProjectEntityConverter;
import com.learning.springboot.sda.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @Autowired
    ProjectEntityConverter entityConverter;

    @GetMapping("/project/id/{projectId}") // din path variable in path parameter
    public ResponseEntity<ProjectDTO> getProjectById(@PathVariable Integer projectId){
        Optional<Project> projectById = projectService.getProjectById(projectId);

        Project projectEntity = projectById.get();
        System.out.println(projectById.get());

        ProjectDTO projectDTO = new ProjectDTO(projectEntity);

        return new ResponseEntity<ProjectDTO>(projectDTO, HttpStatus.OK);
    }

    @GetMapping("/project/{shortName}")
    public ResponseEntity<ProjectDTO> getProjectByShortName(@PathVariable String shortName){
        Optional<Project> projectById = projectService.getProjectByShortName(shortName);

        Project projectEntity = projectById.get();
        System.out.println(projectById.get());

        ProjectDTO projectDTO = new ProjectDTO(projectEntity);

        return new ResponseEntity<ProjectDTO>(projectDTO, HttpStatus.OK);
    }

    @GetMapping("/projectFromConverter")
    public ResponseEntity<ProjectDTO> getProjectByIdConverter(){
        Optional<Project> projectById = projectService.getProjectById(2);

        Project projectEntity = projectById.get();
        System.out.println(projectById.get());

        return new ResponseEntity<ProjectDTO>(
                entityConverter.convertToDTO(projectEntity), HttpStatus.OK);
    }

    @PostMapping(value = "/project", consumes = "application/json")
    public ResponseEntity<Project> createProjectFromProjectCreationDTO(@RequestBody ProjectDTO projectDTO){
        Project project = projectService.saveProject(projectDTO);

        return new ResponseEntity<Project>(project, HttpStatus.OK);
    }
}
