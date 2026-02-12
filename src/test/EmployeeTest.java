package test;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EmployeeTest {

    @Test
    public void testProgrammerIncrement() {

        Employee emp = new Employee(1, "John", 50000, "Programmer", 30);

        double finalSalary = emp.calculateFinalSalary();

        // 10% increment - 55000
        assertEquals(55000, finalSalary, 0.01);
    }

    @Test
    public void testDesignerIncrement() {

        Employee emp = new Employee(2, "Alice", 50000, "Designer", 30);

        double finalSalary = emp.calculateFinalSalary();

        // 20% increment - 60000
        assertEquals(60000, finalSalary, 0.01);
    }

    @Test
    public void testLeaveDeduction() {

        Employee emp = new Employee(3, "Bob", 30000, "Programmer", 35);

        double finalSalary = emp.calculateFinalSalary();

        // Salary after increment = 33000
        // Extra leaves = 3
        // Deduction per leave = 33000 / 30 = 1100
        // Total deduction = 3300
        // Final = 29700

        assertEquals(29700, finalSalary, 0.01);
    }
}