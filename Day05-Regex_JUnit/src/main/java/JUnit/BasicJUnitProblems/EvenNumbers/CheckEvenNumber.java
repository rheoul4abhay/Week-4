package JUnit.BasicJUnitProblems.EvenNumbers;

public class CheckEvenNumber {

    public static boolean isEven(int number){
        return (number%2 == 0);
    }
    public static void main(String[] args) {
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }
}
