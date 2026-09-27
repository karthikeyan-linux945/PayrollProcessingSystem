package com.mentorbridge.payroll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {

        employee = new ContractEmployee(
                "EMP102",
                "Kumar",
                3000,
                400
        );
    }

    @Test
    void shouldCreateEmployee() {

        assertNotNull(employee);
    }

    @Test
    void shouldCalculateGrossSalary() {

        assertEquals(
                3400,
                employee.calculateGrossSalary()
        );
    }

    @Test
    void shouldCalculateDeduction() {

        assertEquals(
                170,
                employee.calculateDeduction()
        );
    }

    @Test
    void shouldCalculateNetSalary() {

        assertEquals(
                3230,
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