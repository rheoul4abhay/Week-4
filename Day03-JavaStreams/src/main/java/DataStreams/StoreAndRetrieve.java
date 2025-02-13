package DataStreams;

import java.io.*;

class Student {
    private int rollNumber;
    private String name;
    private double gpa;

    public Student(int rollNumber, String name, double gpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class StoreAndRetrieve {
    public static void main(String[] args) {
        String fileName = "src/main/java/DataStreams/student_data.dat";

        // Write student details to the binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            Student student = new Student(1, "John Doe", 3.75);
            dos.writeInt(student.getRollNumber());
            dos.writeUTF(student.getName());
            dos.writeDouble(student.getGpa());

            System.out.println("Student data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Read student details from the binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
