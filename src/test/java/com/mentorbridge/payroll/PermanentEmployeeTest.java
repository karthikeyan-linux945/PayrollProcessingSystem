package com.mentorbridge.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp() {

        employee = new PermanentEmployee(
                "EMP101",
                "Arun",
                3000,
                500,
                200
        );
    }

    @Test
    void shouldCreateEmployee() {

        assertNotNull(employee);
    }

    @Test
    void shouldCalculateGrossSalary() {

        assertEquals(
                3700,
                employee.calculateGrossSalary()
        );
    }

    @Test
    void shouldCalculateDeduction() {

        assertEquals(
                370,
                employee.calculateDeduction()
        );
    }

    @Test
    void shouldCalculateNetSalary() {

        assertEquals(
                3330,
                employee.calculateNetSalary()
        );
    }

    @Test
    void netSalaryShouldBeGreaterThanZero() {

        assertTrue(
                employee.calculateNetSalary() > 0
        );
    }
}