package Reflection.BasicLevel.DynamicallyCreateObjects;

public class Student {
    private String name;
    private int age;

    //Default constructor
    public Student(){
        this.name = "Unknown";
        this.age = 0;
    }

    //Parameterized constructor
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Student name : " + name + ", Age : " + age);
    }
}
