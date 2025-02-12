package SetInterface.setsEqualityCheck;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CheckSetsEquality {

    public static <T> boolean checkSetEquality(Set<T> st1, Set<T> st2){
        if(st1.size() != st2.size()) return false;

        Iterator it = st1.iterator();
        while(it.hasNext()){
            if(!st2.contains(it.next())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 3, 1, 5));

        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);
        System.out.println("Given sets are equal ? " + checkSetEquality(set1, set2));

        Set<String> set3 = new HashSet<>(Arrays.asList("Abhay", "Amilia", "Abhay", "Amilia"));
        Set<String> set4 = new HashSet<>(Arrays.asList("Amilia", "Abhay"));

        System.out.println("Set 3 : " + set3);
        System.out.println("Set 4 : " + set4);
        System.out.println("Given sets are equal ? " + checkSetEquality(set3, set4));

        //using in-built method to check for equality of sets
        Set<Integer> set5 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set6 = new HashSet<>(Arrays.asList(6, 5, 1, 3));
        System.out.println("Set 5 : " + set5);
        System.out.println("Set 6 : " + set6);
        System.out.println("Given sets are equal ? " + set5.equals(set6));
    }
}
