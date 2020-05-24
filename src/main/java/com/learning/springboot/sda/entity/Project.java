package com.learning.springboot.sda.entity;

import com.learning.springboot.sda.DTO.ProjectDTO;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    public Project() {
    }

    public Project(ProjectDTO projectDTO, Status status) {
        this.name = projectDTO.name;
        this.shortname = projectDTO.shortName;
        this.description = projectDTO.description;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId")
    Integer projectId;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "shortName", nullable = false)
    String shortname;

    @Column(name = "description")
    String description;

    @ManyToOne
    @JoinColumn(name = "statusId")
    Status status;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", shortname='" + shortname + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
