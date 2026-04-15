package com.example.Fullstack_admin_panel;

import com.example.Fullstack_admin_panel.model.Project;
import com.example.Fullstack_admin_panel.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final ProjectRepository repository;

    public DataLoader(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        repository.save(new Project("Supercool project", "High-end dashboard implementation."));
        repository.save(new Project("Money maker", "Financial tracking application."));
        repository.save(new Project("Ad blocker", "Privacy focused browser extension."));
        System.out.println("✅ Data loaded successfully!");
    }
}