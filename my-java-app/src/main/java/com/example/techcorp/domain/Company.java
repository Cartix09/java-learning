package com.example.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private double cash;
    private List<Project> projects;

    public Company(String name, double cash) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Company name cannot be empty.");
        }

        if (cash < 0) {
            throw new IllegalArgumentException("Cash cannot be negative.");
        }

        this.name = name;
        this.cash = cash;
        this.projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project) {
        if (project == null) {
            throw new IllegalArgumentException("Project cannot be null.");
        }

        projects.add(project);
    }

    public void changeCash(double amount) {
        double newCash = cash + amount;
        cash = newCash;
    }
}