package com.example.techcorp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    void employeeStoresValidName() {
        Employee employee = new Employee("Anna", 8);
        assertEquals("Anna", employee.getName());
    }

    @Test
    void employeeStoresValidSkill() {
        Employee employee = new Employee("Anna", 8);
        assertEquals(8, employee.getSkill());
    }

    @Test
    void employeeRejectsEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("", 8);
        });
    }

    @Test
    void employeeRejectsBlankName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("   ", 8);
        });
    }

    @Test
    void employeeRejectsNullName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee(null, 8);
        });
    }

    @Test
    void employeeRejectsZeroSkill() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("Anna", 0);
        });
    }

    @Test
    void employeeRejectsNegativeSkill() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Employee("Anna", -3);
        });
    }
}