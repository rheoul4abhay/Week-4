package JUnit.BasicJUnitProblems.ListOperations;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        addElement(numbers, 5);
        addElement(numbers, 10);
        addElement(numbers, 15);
        System.out.println("List after adding elements: " + numbers);

        removeElement(numbers, 10);
        System.out.println("List after removing element 10: " + numbers);

        System.out.println("List size: " + getSize(numbers));
    }
}