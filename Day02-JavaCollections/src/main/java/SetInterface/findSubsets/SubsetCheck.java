package SetInterface.findSubsets;
import java.util.*;

public class SubsetCheck {

    public static <T> boolean checkSubset(Set<T> st1, Set<T> st2){
        for(T element: st1){
            if(!st2.contains(element)) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Set<Integer> st1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> st2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Set 1 is subset of Set 2 ? " + checkSubset(st1, st2));

        Set<String> st3 = new HashSet<>(Arrays.asList("Abhay", "Rose"));
        Set<String> st4 = new HashSet<>(Arrays.asList("Mary", "Abhay", "Rin"));
        System.out.println("Set 3 is subset of Set 4 ? " + checkSubset(st3, st4));
    }
}
