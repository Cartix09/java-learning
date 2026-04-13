package com.example.techcorp.engine;

import com.example.techcorp.domain.Company;
import com.example.techcorp.domain.Project;
import com.example.techcorp.domain.ProjectStatus;
import com.example.techcorp.ui.ConsoleUI;

public class GameEngine {

    private final Company company;
    private final ConsoleUI ui;
    private boolean running;
    private int turn;
    private final int maxTurns = 10;

    public GameEngine(Company company, ConsoleUI ui) {
        this.company = company;
        this.ui = ui;
        this.running = true;
        this.turn = 1;
    }

    public void start() {
        while (running) {
            ui.showTurnHeader(turn);
            ui.showMainMenu();

            int choice = ui.readMenuChoice();
            handleChoice(choice);

            if (running) {
                advanceTurn();
                turn++;
            }
        }
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> ui.showCompanyStatus(company);
            case 2 -> startPlannedProjects();
            case 3 -> workOnProjects();
            case 4 -> {
                ui.showMessage("Exiting game.");
                running = false;
            }
            default -> ui.showMessage("Invalid menu option.");
        }
    }

    private void startPlannedProjects() {
        for (Project project : company.getProjects()) {
            if (project.getStatus() == ProjectStatus.PLANNED) {
                project.start();
            }
        }

        ui.showMessage("All planned projects have been started.");
    }

    private void workOnProjects() {
        for (Project project : company.getProjects()) {
            project.workOneTurn();
        }

        company.changeCash(-3000);
        ui.showMessage("Projects worked for one turn.");
        ui.showMessage("Operating cost for this turn: 3000");
    }

    private void advanceTurn() {
        if (allProjectsFinished()) {
            ui.showMessage("All projects are finished. You win.");
            running = false;
            return;
        }

        if (company.getCash() < 0) {
            ui.showMessage("Company cash fell below zero. You lose.");
            running = false;
            return;
        }

        if (turn >= maxTurns) {
            ui.showMessage("Maximum number of turns reached. Game over.");
            running = false;
        }
    }

    private boolean allProjectsFinished() {
        if (company.getProjects().isEmpty()) {
            return false;
        }

        for (Project project : company.getProjects()) {
            if (!project.isFinished()) {
                return false;
            }
        }

        return true;
    }
}