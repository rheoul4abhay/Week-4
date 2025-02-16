package Reflection.BasicLevel.AccessPrivateField;
import java.lang.reflect.*;

public class AccessPrivateField {
    public static void main(String[] args) {
        Person person = new Person();

        try{
            Class<?> cls = person.getClass();

            //To access private fields
            Field field = cls.getDeclaredField("age");

            //Access private field dynamically
            field.setAccessible(true); //Allow access to private field
            System.out.println("Old age : " + field.get(person));

            //Modify private age field
            field.set(person, 44);
            System.out.println("Modified age : " + field.get(person));
        } catch (Exception e){
            System.out.println("Exeption: " + e.getMessage());
        }

    }
}
