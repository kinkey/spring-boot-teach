package com.learning.springboot.sda.service;

import com.learning.springboot.sda.DTO.ProjectDTO;
import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.entity.Status;
import com.learning.springboot.sda.repository.ProjectRepository;
import com.learning.springboot.sda.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    StatusRepository statusRepository;

    @Autowired
    ProjectEntityConverter projectEntityConverter;

    @Transactional
    public Optional<Project> getProjectById(Integer id){
        return projectRepository.findById(id);
    }

    @Transactional
    public Optional<Project> getProjectByShortName(String shortname){
        return projectRepository.getByShortname(shortname);
    }

    @Transactional
    public void saveProjectWithSpecialConversion(ProjectDTO projectDTO){
        Project projectEntityToSave = projectEntityConverter.convertToEntity(projectDTO);

        //projectRepository.save(project);
    }

    @Transactional
    public Project saveProject(ProjectDTO projectDTO){

        Optional<Status> byStatusName = statusRepository.getByStatusName(projectDTO.statusName);

        Status status = null;
        if(!byStatusName.isPresent()){
            Status newStatus = new Status(projectDTO.statusName);
            status = statusRepository.save(newStatus);
        } else {
            status = byStatusName.get();
        }

        Project projectEntityToSave = new Project(projectDTO,status );

        Project savedProject = projectRepository.save(projectEntityToSave);

        return savedProject;
    }


}
