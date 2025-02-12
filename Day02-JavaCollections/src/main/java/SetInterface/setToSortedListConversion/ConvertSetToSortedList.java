package SetInterface.setToSortedListConversion;
import java.util.*;

public class ConvertSetToSortedList {

    public static List<Integer> convertSetToSortedList(Set<Integer> st){
        List<Integer> result = new ArrayList<>(st);
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args){
        Set<Integer> st = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Given set -> " + st);
        System.out.println("Sorted List -> " + convertSetToSortedList(st));
    }
}
