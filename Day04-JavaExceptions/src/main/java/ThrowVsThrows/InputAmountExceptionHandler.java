package ThrowVsThrows;

import java.util.Scanner;

public class InputAmountExceptionHandler {

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount < 0 || rate < 0){
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        } else{
            return (amount*rate*years)/100.0;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter amount -> $");
            double amount = scanner.nextDouble();
            System.out.print("\nEnter rate -> ");
            double rate = scanner.nextDouble();
            System.out.print("\nEnter years -> ");
            int time = scanner.nextInt();
            double interest = calculateInterest(amount, rate, time);
            System.out.println("\nCalculated interest is " + interest);
        } catch(IllegalArgumentException e){
            System.out.println( e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
