package ExceptionPropagation;

public class ExceptionPropagationDemonstration {

    public static void method1() throws ArithmeticException{
        System.out.println("Inside method1");
        int result = 10/0; //To throw arithmetic exception
    }

    public static void method2() throws ArithmeticException{
        System.out.println("Inside method2");
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        } catch (ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
