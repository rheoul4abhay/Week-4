package Reflection.BasicLevel.GetClassInformation;

import java.lang.reflect.*;
import java.util.Scanner;
public class ClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fully qualified class name (For eg., java.util.ArrayList): ");
        String className = scanner.nextLine();

        try{
            //Load class
            Class<?> cls = Class.forName(className);

            //To display class name
            System.out.println("\nClass name : " + cls.getName());

            //To display methods
            System.out.println("\nMethods: ");
            Method[] methods = cls.getDeclaredMethods();
            for(Method method: methods){
                System.out.println(method);
            }

            //To display fields
            System.out.println("\nFields: ");
            Field[] fields = cls.getDeclaredFields();
            for(Field field: fields){
                System.out.println(field);
            }

            //To display constructors
            System.out.println("\nConstructors: ");
            Constructor<?>[] constructors = cls.getDeclaredConstructors();
            for(Constructor constructor: constructors){
                System.out.println(constructor);
            }

        } catch(ClassNotFoundException e){
            System.out.println("Class not found : " + className);
        } finally {
            scanner.close();
        }
    }
}
