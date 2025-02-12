package ListInterface.RemoveDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesPreservingOrder {

    //Generic method to remove duplicates from a list in place
    public static <T> List<T> removeDuplicates(List<T> list){
        List<T> temp = new ArrayList<>();

        for(T element: list){
            if(!temp.contains(element)){
                temp.add(element);
            }
        }
        return temp;
    }

    public static void main(String[] arr){
        Integer[] numberArray = {1, 2, 3, 1, 5, 2, 6};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(numberArray));

        System.out.println("Before removing duplicates : " + arrayList);
        List<Integer> newNumbersArray = removeDuplicates(arrayList);
        System.out.println("After removing duplicates : " + newNumbersArray);
    }
}
