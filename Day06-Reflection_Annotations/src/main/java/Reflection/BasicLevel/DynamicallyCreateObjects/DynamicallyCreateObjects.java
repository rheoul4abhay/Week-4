package Reflection.BasicLevel.DynamicallyCreateObjects;
import java.lang.reflect.*;

public class DynamicallyCreateObjects {
    public static void main(String[] args) {
        try{
            //Load class dynamically
            Class<?> cls = Class.forName("Reflection.BasicLevel.DynamicallyCreateObjects.Student");

            //create an object using default constructor
            Object obj1 = cls.getDeclaredConstructor().newInstance();
            ((Student) obj1).display();

            //create an object using parameterized constructor(can be multiple hence we use generic type to hold unknown types)
            Constructor<?> constructor = cls.getDeclaredConstructor(String.class, int.class);
            Object obj2 = constructor.newInstance("Abhay", 22);
            ((Student) obj2).display();

        } catch (Exception e){
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
