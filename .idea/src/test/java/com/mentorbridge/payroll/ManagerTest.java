package com.mentorbridge.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ManagerTest {

    private Manager manager;

    @BeforeEach
    void setUp() {

        manager = new Manager(
                "EMP103",
                "Priya",
                5000,
                800,
                300,
                1000
        );
    }

    @Test
    void shouldCreateManager() {

        assertNotNull(manager);
    }

    @Test
    void shouldCalculateGrossSalary() {

        assertEquals(
                7100,
                manager.calculateGrossSalary()
        );
    }

    @Test
    void shouldCalculateDeduction() {

        assertEquals(
                852,
                manager.calculateDeduction()
        );
    }

    @Test
    void shouldCalculateNetSalary() {

        assertEquals(
                6248,
                manager.calculateNetSalary()
        );
    }

    @Test
    void netSalaryShouldBeGreaterThanZero() {

        assertTrue(
                manager.calculateNetSalary() > 0
        );
    }
}