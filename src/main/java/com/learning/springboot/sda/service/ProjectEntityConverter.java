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
            dto.status = projectEntity.getStatus().getStatusName();
        } else {
            dto.status = "Undefined Status";
        }
        return dto;
    }

    @Override
    public Project convertToEntity(ProjectDTO dto) {
        return null;
    }
}
