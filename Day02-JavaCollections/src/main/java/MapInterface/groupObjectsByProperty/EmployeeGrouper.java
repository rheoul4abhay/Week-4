package MapInterface.groupObjectsByProperty;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeGrouper {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(e -> e.department));
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Alice", "HR"), new Employee("Bob", "IT"), new Employee("Carol", "HR"));
        System.out.println(groupByDepartment(employees));
    }
}
