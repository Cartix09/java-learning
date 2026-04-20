package com.example.techcorp.domain;

public class Employee {

    protected String name;
    protected int skill;

    public Employee(String name, int skill) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Employee name cannot be empty.");
        }

        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be positive.");
        }

        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public int work() {
        return skill;
    }

    public String getRole() {
        return "Employee";
    }
}