package com.example.techcorp;

import com.example.techcorp.domain.Company;
import com.example.techcorp.domain.Project;
import com.example.techcorp.engine.GameEngine;
import com.example.techcorp.ui.ConsoleUI;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TechCorp", 50000);

        company.addProject(new Project("Mobile App", 20));
        company.addProject(new Project("Website", 15));

        ConsoleUI ui = new ConsoleUI();
        GameEngine engine = new GameEngine(company, ui);
        engine.start();
    }
}