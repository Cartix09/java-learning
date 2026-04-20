package com.example.techcorp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CompanyTest {

    @Test
    void companyStoresValidName() {
        Company company = new Company("TechCorp", 50000);
        assertEquals("TechCorp", company.getName());
    }

    @Test
    void companyStoresValidCash() {
        Company company = new Company("TechCorp", 50000);
        assertEquals(50000.0, company.getCash());
    }

    @Test
    void companyRejectsEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Company("", 50000);
        });
    }

    @Test
    void companyRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Company("   ", 50000);
        });
    }

    @Test
    void companyRejectsNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Company(null, 50000);
        });
    }

    @Test
    void companyRejectsNegativeCash() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Company("TechCorp", -100);
        });
    }

    @Test
    void companyRejectsNullProject() {
        Company company = new Company("TechCorp", 50000);

        assertThrows(IllegalArgumentException.class, () -> {
            company.addProject(null);
        });
    }

    @Test
    void companyAddsProjectCorrectly() {
        Company company = new Company("TechCorp", 50000);
        Project project = new Project("Website", 20);

        company.addProject(project);

        assertEquals(1, company.getProjects().size());
        assertEquals("Website", company.getProjects().get(0).getName());
    }
}
