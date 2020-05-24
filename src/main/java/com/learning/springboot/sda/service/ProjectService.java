package com.learning.springboot.sda.service;

import com.learning.springboot.sda.entity.Project;
import com.learning.springboot.sda.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Transactional
    public Optional<Project> getProjectById(Integer id){
        return projectRepository.findById(id);
    }

    @Transactional
    public Optional<Project> getProjectByShortName(String shortname){
        return projectRepository.getByShortname(shortname);
    }

    @Transactional
    public void saveProject(Project project){
        projectRepository.save(project);
    }
}
