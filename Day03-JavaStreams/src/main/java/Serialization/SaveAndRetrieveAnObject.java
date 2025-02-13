package Serialization;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class SaveAndRetrieveAnObject {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 60000));
        employees.add(new Employee(3, "Charlie", "Finance", 55000));

        // Serialize the list of employees to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/Serialization/employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employee list serialized and saved.");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        // Deserialize the list of employees from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/java/Serialization/employees.dat"))) {
            List<Employee> deserializedEmployees = (List<Employee>) ois.readObject();
            System.out.println("Employee list deserialized and retrieved:");
            for (Employee employee : deserializedEmployees) {
                System.out.println(employee);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization: " + e.getMessage());
        }
    }
}

