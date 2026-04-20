package com.example.techcorp.domain;

public class Employee {

    private String name;
    private int skill;

    public Employee(String name, int skill) {
        setName(name);
        setSkill(skill);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid employee name.");
        }
        this.name = name;
    }

    public void setSkill(int skill) {
        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be positive.");
        }
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