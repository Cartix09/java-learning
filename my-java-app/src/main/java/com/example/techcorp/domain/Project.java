package com.example.techcorp.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private int requiredWork;
    private int progress;
    private ProjectStatus status;
    private List<Employee> employees;

    public Project(String name, int requiredWork) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid project name.");
        }

        if (requiredWork <= 0) {
            throw new IllegalArgumentException("Work must be positive.");
        }

        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.status = ProjectStatus.PLANNED;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getRequiredWork() {
        return requiredWork;
    }

    public int getProgress() {
        return progress;
    }

    public ProjectStatus getStatus() {
        return status;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public boolean isFinished() {
        return progress >= requiredWork;
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null.");
        }

        employees.add(employee);
    }

    public void start() {
        if (status == ProjectStatus.PLANNED) {
            status = ProjectStatus.IN_PROGRESS;
        }
    }

    public void addProgress(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Progress cannot be negative.");
        }

        if (status == ProjectStatus.FINISHED) {
            return;
        }

        progress += amount;

        if (progress > requiredWork) {
            progress = requiredWork;
        }

        if (progress >= requiredWork) {
            status = ProjectStatus.FINISHED;
        }
    }

    public void workOneTurn() {
        if (status != ProjectStatus.IN_PROGRESS) {
            return;
        }

        int workDone = 0;

        for (Employee employee : employees) {
            workDone += employee.work();
        }

        addProgress(workDone);
    }
}