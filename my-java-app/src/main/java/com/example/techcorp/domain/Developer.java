package com.example.techcorp.domain;

public class Developer extends Employee {

    public Developer(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return getSkill() * 2;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}