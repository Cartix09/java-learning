package com.example.techcorp;

import com.example.techcorp.domain.Company;
import com.example.techcorp.domain.Developer;
import com.example.techcorp.domain.Manager;
import com.example.techcorp.domain.Project;
import com.example.techcorp.domain.Tester;
import com.example.techcorp.engine.GameEngine;
import com.example.techcorp.ui.ConsoleUI;

public class Main {

    public static void main(String[] args) {
        Company company = new Company("TechCorp", 50000);

        Project mobileApp = new Project("Mobile App", 40);
        Project website = new Project("Website", 30);

        mobileApp.addEmployee(new Developer("Anna", 8));
        mobileApp.addEmployee(new Tester("Piotr", 6));

        website.addEmployee(new Developer("Marek", 7));
        website.addEmployee(new Manager("Ewa", 5));

        company.addProject(mobileApp);
        company.addProject(website);

        ConsoleUI ui = new ConsoleUI();
        GameEngine engine = new GameEngine(company, ui);
        engine.start();
    }
}