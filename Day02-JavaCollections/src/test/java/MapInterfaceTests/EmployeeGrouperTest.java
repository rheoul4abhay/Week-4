package MapInterfaceTests;

import MapInterface.groupObjectsByProperty.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeGrouperTest {

    private List<Employee> employees;

    @BeforeEach
    public void setUp() {
        // Create a list of sample employees for testing
        employees = List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR"),
                new Employee("David", "IT")
        );
    }

    @Test
    public void testGroupByDepartment() {
        // Call the method to group employees by department
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        // Verify that the group sizes are correct
        assertEquals(2, groupedEmployees.size(), "There should be two departments: HR and IT");

        // Verify the groups for HR
        List<Employee> hrEmployees = groupedEmployees.get("HR");
        assertNotNull(hrEmployees, "HR group should not be null");
        assertEquals(2, hrEmployees.size(), "HR should have 2 employees");
        assertTrue(hrEmployees.contains(new Employee("Alice", "HR")), "HR group should contain Alice");
        assertTrue(hrEmployees.contains(new Employee("Carol", "HR")), "HR group should contain Carol");

        // Verify the groups for IT
        List<Employee> itEmployees = groupedEmployees.get("IT");
        assertNotNull(itEmployees, "IT group should not be null");
        assertEquals(2, itEmployees.size(), "IT should have 2 employees");
        assertTrue(itEmployees.contains(new Employee("Bob", "IT")), "IT group should contain Bob");
        assertTrue(itEmployees.contains(new Employee("David", "IT")), "IT group should contain David");
    }

    @Test
    public void testEmptyEmployeeList() {
        // Test with an empty employee list
        List<Employee> emptyList = new ArrayList<>();
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(emptyList);

        // Verify that the result is an empty map
        assertTrue(groupedEmployees.isEmpty(), "The grouped result should be an empty map");
    }

    @Test
    public void testSingleEmployee() {
        // Test with a single employee
        List<Employee> singleEmployeeList = List.of(new Employee("Alice", "HR"));
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(singleEmployeeList);

        // Verify that the result contains the correct grouping
        assertEquals(1, groupedEmployees.size(), "There should be one department");
        assertEquals(1, groupedEmployees.get("HR").size(), "HR should have one employee");
    }
}
