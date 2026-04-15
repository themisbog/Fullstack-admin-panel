package com.example.Fullstack_admin_panel.repository;

import com.example.Fullstack_admin_panel.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}