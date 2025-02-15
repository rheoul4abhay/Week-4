package UncheckedException;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("------Enter two number to divide------ ");
            System.out.print("\nEnter first number : ");
            int num1 = sc.nextInt();
            System.out.println();
            System.out.print("\nEnter second number : ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result of division -> " + result);
        } catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        } catch(InputMismatchException e){
            System.out.println("Input type not valid");
        } finally {
            sc.close();
        }
    }
}
