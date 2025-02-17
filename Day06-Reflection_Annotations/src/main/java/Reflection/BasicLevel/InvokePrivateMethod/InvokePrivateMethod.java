package Reflection.BasicLevel.InvokePrivateMethod;
import java.lang.reflect.*;

public class InvokePrivateMethod {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try{
            Class<?> cls = calculator.getClass();
            Method multiplyMethod = cls.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true);

            //invoke method dynamically
            int result1 = (int)multiplyMethod.invoke(calculator, 10, 20);

            System.out.println("Multiplication result : " + result1);

            Method additionMethod = cls.getDeclaredMethod("add", int.class, int.class);
            additionMethod.setAccessible(true);
            int result2 = (int)additionMethod.invoke(calculator, 10, 20);
            System.out.println("Addition result : " + result2);
        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("General exception: " + e.getMessage());
        }
    }
}
