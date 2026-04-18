package com.example.Fullstack_admin_panel.controller;

import com.example.Fullstack_admin_panel.model.Project;
import com.example.Fullstack_admin_panel.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects") 
@CrossOrigin(origins = "*")     
public class ProjectController {

    private final ProjectRepository repository;

    
    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }

    
    @GetMapping
    public List<Project> getAllProjects() {
        return repository.findAll();
    }
}