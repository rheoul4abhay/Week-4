package MapInterface.findKeyWithHighestValue;

import java.util.*;

public class FindHighestValueKey{
    public static String findMaxKey(Map<String, Integer> map) {
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }

    public static void main(String[] args) {
        Map<String, Integer> input = Map.of("A", 10, "B", 20, "C", 15);
        System.out.println(findMaxKey(input));
    }
}