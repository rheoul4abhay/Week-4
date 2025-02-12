package ListInterface.ReverseList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    //Common method to reverse both arraylist and linkedlist
    public static <T> List<T> reverseList(List<T> list){
        int left = 0;
        int right = list.size()-1;
        while(left < right){
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
        return list;
    }

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Original Array list : " + arrayList);
        System.out.println("Reversed Array list : " + reverseList(arrayList));

        String[] cities = {"Mumbai", "Bhopal", "London", "New York", "Sydney"};
        LinkedList<String> citiesList = new LinkedList<>(Arrays.asList(cities));
        System.out.println("Original linked list : " + citiesList);
        System.out.println("Reversed linked list : " + reverseList(citiesList));
    }
}
