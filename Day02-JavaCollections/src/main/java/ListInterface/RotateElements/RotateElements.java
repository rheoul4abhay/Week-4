package ListInterface.RotateElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElements {

    //Generic method which can take any type of list
    public static <T> void reverseList(List<T> list, int start, int end){
        int low = start;
        int high = end;

        while(low < high){
            T temp = list.get(low);
            list.set(low, list.get(high));
            list.set(high, temp);
            low++;
            high--;
        }
    }

    //Generic method which can take any type of list
    public static <T> List<T> rotateList(List<T> list, int n){

        if(list.size() == 0) return list;
        int positions = n % list.size(); //for eg. 5 rotations for a 5 size list results in original list
        reverseList(list, 0, positions-1);
        reverseList(list, positions, list.size()-1);
        reverseList(list, 0, list.size()-1);
        return list;
    }

    public static void main(String[] args){
        String[] names = {"Abhay", "Sam", "Rohit", "Mark", "Wilson"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        int n = 2; //positions to rotate

        System.out.println("Before rotation: " + namesList);
        System.out.println("After rotating by " + n + " positions : " + rotateList(namesList, 2));

        Integer[] arr = {1, 5, 6, 2, 10};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        n = 3; //positions to rotate

        System.out.println("Before rotation: " + arrayList);
        System.out.println("After rotating by " + n + " positions : " + rotateList(arrayList, n));
    }
}
