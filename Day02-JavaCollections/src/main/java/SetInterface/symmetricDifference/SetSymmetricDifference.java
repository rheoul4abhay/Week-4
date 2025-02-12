package SetInterface.symmetricDifference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetSymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2){
        Set<T> symmetricDifferenceSet = new HashSet<>(set1);
        for(T element: set2){
            if(set1.contains(element)){
                symmetricDifferenceSet.remove(element);
            }
            else {
                symmetricDifferenceSet.add(element);
            }
        }
        return symmetricDifferenceSet;
    }
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Symmetric difference of both sets is : " + symmetricDifference(set1, set2));
    }
}
