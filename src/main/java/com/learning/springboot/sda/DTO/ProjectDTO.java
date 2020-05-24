package com.learning.springboot.sda.DTO;

import com.learning.springboot.sda.entity.Project;

public class ProjectDTO {
    public String name;
    public String shortName;
    public String description;
    public String status;

    public ProjectDTO() {
    }

    public ProjectDTO(Project projectEntity) {
        this.name = projectEntity.getName();
        this.description = projectEntity.getDescription();
        this.shortName = projectEntity.getDescription();

        if(projectEntity.getStatus() != null){
            this.status = projectEntity.getStatus().getStatusName();
        } else {
            this.status = "Undefined Status";
        }
    }
}
