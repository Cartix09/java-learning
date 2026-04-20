package com.example.techcorp.domain;

public class Manager extends Employee {

    public Manager(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill / 2 + 1;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}