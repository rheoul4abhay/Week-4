package JUnit.BasicJUnitProblems.ArithmeticExceptionHandling;

public class ArithmeticExceptionHandler {

    public static int divide(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Cannot divide first number by zero");
        } else{
            return num1/num2;
        }
    }

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 0;
        System.out.println("Dividing " + num1 + " by " + num2 + "......");
        try{
            int result = divide(num1, num2);
            System.out.println(num1 + " divided by " + num2 + " is " + result);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
