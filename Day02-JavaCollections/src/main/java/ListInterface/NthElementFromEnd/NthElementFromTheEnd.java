package ListInterface.NthElementFromEnd;
import java.util.*;

public class NthElementFromTheEnd {

    public static <T> T findNthElementFromEnd(List<T> list,int n){
        int length = 0;
        for(T element: list) {
            length++;
        }
        if(n > length || n == 0) return null;
        Collections.reverse(list);
        return list.get(n-1);
    }

    public static void main(String[] args){
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> integerList = new LinkedList<>(Arrays.asList(arr));
        int n = 13;
        System.out.println("Given array " + integerList);
        System.out.println(n + "th element from end of list is : " + (findNthElementFromEnd(integerList, n) == null ? "Not found" : findNthElementFromEnd(integerList, n)));

        String[] foods = {"Pasta", "Pizza", "Noodles", "Burger", "Chocolate Pastry"};
        List<String> foodList = new LinkedList<>(Arrays.asList(foods));
        System.out.println("Given array " + foodList);
        System.out.println(n + "th element from end of list is :  " + (findNthElementFromEnd(integerList, n) == null ? "Not found" : findNthElementFromEnd(integerList, n)));
    }
}
