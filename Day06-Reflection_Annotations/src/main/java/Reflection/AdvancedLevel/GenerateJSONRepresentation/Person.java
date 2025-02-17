package Reflection.AdvancedLevel.GenerateJSONRepresentation;

public class Person {
    private String name;
    private int age;
    private boolean isEmployed;
    private Address address;

    public Person(String name, int age, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    public void setAddress(Address address){
        this.address = address;
    }
}
