package com.example.techcorp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProjectTest {

    @Test
    void projectStoresValidName() {
        Project project = new Project("Website", 20);
        assertEquals("Website", project.getName());
    }

    @Test
    void projectStoresRequiredWork() {
        Project project = new Project("Website", 20);
        assertEquals(20, project.getRequiredWork());
    }

    @Test
    void projectStartsWithZeroProgress() {
        Project project = new Project("Website", 20);
        assertEquals(0, project.getProgress());
    }

    @Test
    void projectStartsAsPlanned() {
        Project project = new Project("Website", 20);
        assertEquals(ProjectStatus.PLANNED, project.getStatus());
    }

    @Test
    void projectRejectsEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Project("", 20);
        });
    }

    @Test
    void projectRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Project("   ", 20);
        });
    }

    @Test
    void projectRejectsNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Project(null, 20);
        });
    }

    @Test
    void projectRejectsZeroRequiredWork() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Project("Website", 0);
        });
    }

    @Test
    void projectRejectsNegativeRequiredWork() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Project("Website", -5);
        });
    }

    @Test
    void projectRejectsNegativeProgressAddition() {
        Project project = new Project("Website", 20);

        assertThrows(IllegalArgumentException.class, () -> {
            project.addProgress(-1);
        });
    }

    @Test
    void projectCapsProgressAtRequiredWork() {
        Project project = new Project("Website", 20);
        project.start();
        project.addProgress(50);

        assertEquals(20, project.getProgress());
        assertEquals(ProjectStatus.FINISHED, project.getStatus());
        assertTrue(project.isFinished());
    }
}