package Reflection.BasicLevel.AccessPrivateField;
import java.lang.reflect.*;

public class AccessPrivateField {
    public static void main(String[] args) {
        Person person = new Person();

        try{
            Class<?> cls = person.getClass();

            //To access private fields
            Field ageField = cls.getDeclaredField("age");
            //Access private field dynamically
            ageField.setAccessible(true); //Allow access to private field
            System.out.println("Old age: " + ageField.get(person));

            //Modify private age field
            ageField.set(person, 44);
            System.out.println("Modified age: " + ageField.get(person));

            Field nameField = cls.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println("Old name: " + nameField.get(person));
            nameField.set(person, "Rohit");
            System.out.println("Modified name: " + nameField.get(person));

            Field salaryField = cls.getDeclaredField("salary");
            salaryField.setAccessible(true);
            System.out.println("Old salary: $" + salaryField.get(person));
            salaryField.set(person, 75_000);
            System.out.println("Modified salary: $" + salaryField.get(person));

        } catch (NoSuchFieldException | IllegalAccessException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
