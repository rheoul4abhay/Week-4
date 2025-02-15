package NestedTryCatchBlock;

import java.util.Scanner;

public class NestedTryCatchBlockDemonstration {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Nested try-catch block demonstration
        try{
            System.out.print("\nEnter size of the array : ");
            int size = scanner.nextInt();
            int[] arr = null;
            if(size > 0){
                System.out.println("Enter elements of the array");
                arr = new int[size];
                for(int i = 0; i < size; i++){
                    System.out.print("\nEnter element " + (i+1) + " : ");
                    arr[i] = scanner.nextInt();
                }
            }
            System.out.print("\nEnter divisor : ");
            int divisor = scanner.nextInt();
            System.out.print("\nEnter index of element to divide : ");
            int index = scanner.nextInt();
            int element = arr[index];
            try{
                int result = element / divisor;
                System.out.println("Division result : " + result);
            } catch (ArithmeticException e){
                System.out.print("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        } finally {
            scanner.close();
        }
    }
}
