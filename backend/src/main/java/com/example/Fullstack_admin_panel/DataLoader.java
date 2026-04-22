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
        repository.save(new Project(
            "CloudMetrics Analytics", 
            "Real-time monitoring tool for cloud infrastructure, featuring dynamic data visualization and server health reports."
        ));

        repository.save(new Project(
            "SafePass Encryption Vault", 
            "Secure password management system using AES-256 encryption. Includes browser extension support and multi-factor auth."
        ));

        repository.save(new Project(
            "EcoTrack Sustainability", 
            "A mobile-first application designed to track and reduce individual carbon footprints through gamified daily challenges."
        ));

        repository.save(new Project(
            "FinStream AI Advisor", 
            "Personal finance assistant that uses machine learning to categorize expenses and provide automated budget optimization."
        ));
        repository.save(new Project(
            "HealthSync Wearable API", 
            "High-performance API gateway for aggregating data from multiple fitness wearables into a unified health dashboard."
        ));

        repository.save(new Project(
            "QuickShip Logistics", 
            "Supply chain management platform with real-time GPS tracking and automated inventory forecasting using historical data."
        ));
        System.out.println("✅ Data loaded successfully!");
    }
}