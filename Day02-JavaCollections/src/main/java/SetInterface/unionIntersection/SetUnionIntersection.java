package SetInterface.unionIntersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnionIntersection {

    public static <T> Set<T> findUnion(Set<T> set1, Set<T> set2){
        if(set1.isEmpty()) return set2;
        if(set2.isEmpty()) return set1;
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> findIntersection(Set<T> set1, Set<T> set2){
        Set<T> intersectionSet = new HashSet<>();
        for(T element: set1){
            if(set2.contains(element)){
                intersectionSet.add(element);
            }
        }
        return intersectionSet;
    }
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 3, 5, 4, 7));

        System.out.println("Union of sets : " + findUnion(set1, set2));
        System.out.println("Intersection of sets : " + findIntersection(set1, set2));
        //Finding union and intersection using in built methods
        /*
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Union of given sets : " + union);
        System.out.println("Intersection of given sets : " + intersection);
        */
    }
}
