package ListInterface.ElementsFrequency;

import java.util.*;

public class FindElementFrequency {

    public static <T> Map<String, Integer> countFrequency(List<T> list){
        Map<String, Integer> mpp = new HashMap<>();

        for(T element: list){
            String key = String.valueOf(element);
            if(mpp.containsKey(key)) {
                mpp.put(key, mpp.get(key) + 1);
            }
            mpp.putIfAbsent(key, 1);
        }
        return mpp;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Abhay");
        names.add("Mark");
        names.add("Keth");
        names.add("Abhay");
        names.add("Liam");
        names.add("Jake");

        //Or
        /*
        String[] str = {"Abhay", "Mark", "Keth", "Abhay", "Liam", "Jake"};
        ArrayList<String> names = new ArrayList<>(Arrays.asList(str));
        */
        System.out.println("Frequency of names in list : " + countFrequency(names));

        Integer[] numbersArray = {1, 7, 7, 2, 3, 5, 2, 10};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArray));
        System.out.println("Frequency of numbers in list : " + countFrequency(numbers));
    }
}
