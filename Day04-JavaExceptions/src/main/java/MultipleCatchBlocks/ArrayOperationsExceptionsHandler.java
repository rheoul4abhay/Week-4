package MultipleCatchBlocks;

import java.util.Scanner;

public class ArrayOperationsExceptionsHandler {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("\nEnter size of array : ");
            int size = scanner.nextInt();
            System.out.println();
            int[] arr = (size > 0) ? new int[size] : null;
            if(size > 0){
                System.out.println("Enter elements of the array");
            }
            for(int i = 0; i < size; i++){
                System.out.print("\nEnter element " + (i+1) + " : ");
                arr[i] = scanner.nextInt();
            }
            System.out.print("\nEnter index to access : ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + " : " + arr[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        } catch(NullPointerException e){
            System.out.println("Array is not initilized!");
        } finally{
            scanner.close();
        }

    }
}
