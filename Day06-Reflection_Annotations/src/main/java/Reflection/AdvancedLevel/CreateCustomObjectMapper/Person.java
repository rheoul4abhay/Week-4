package Reflection.AdvancedLevel.CreateCustomObjectMapper;

public class Person {
    private String name;
    private int age;

    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    @Override
    public String toString(){
        return "Person{name='" + name + "' age=" + age + "}";
    }
}
