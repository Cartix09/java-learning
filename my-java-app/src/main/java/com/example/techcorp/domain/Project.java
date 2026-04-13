package com.example.techcorp.domain;

public class Project {

    private String name;
    private int requiredWork;
    private int progress;
    private ProjectStatus status;

    public Project(String name, int requiredWork) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Project name cannot be empty.");
        }

        if (requiredWork <= 0) {
            throw new IllegalArgumentException("Required work must be positive.");
        }

        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
        this.status = ProjectStatus.PLANNED;
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

    public boolean isFinished() {
        return status == ProjectStatus.FINISHED;
    }

    public void start() {
        if (status == ProjectStatus.PLANNED) {
            status = ProjectStatus.IN_PROGRESS;
        }
    }

    public void workOneTurn() {
        if (status == ProjectStatus.IN_PROGRESS) {
            progress += 5;

            if (progress >= requiredWork) {
                progress = requiredWork;
                status = ProjectStatus.FINISHED;
            }
        }
    }
}