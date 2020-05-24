package com.learning.springboot.sda.service;

import com.learning.springboot.sda.DTO.ProjectDTO;
import com.learning.springboot.sda.entity.Project;
import org.springframework.stereotype.Service;

@Service
public class ProjectEntityConverter implements
        EntityConverter<Project, ProjectDTO>{


    public ProjectDTO convertToDTO(Project projectEntity){
        ProjectDTO dto = new ProjectDTO();

        dto.name = projectEntity.getName();
        dto.description = projectEntity.getDescription();
        dto.shortName = projectEntity.getDescription();

        if(projectEntity.getStatus() != null){
            dto.statusName = projectEntity.getStatus().getStatusName();
        } else {
            dto.statusName = "Undefined Status";
        }
        return dto;
    }

    @Override
    public Project convertToEntity(ProjectDTO dto) {
        Project projectEntity = new Project();

        projectEntity.setName(dto.name);
        projectEntity.setShortname(dto.shortName);
        projectEntity.setDescription(dto.description);

        return projectEntity;
    }
}
