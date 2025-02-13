package MapInterface.mergeTwoMaps;

import java.util.*;

public class MergeTwoMaps {
    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        Map<K, Integer> mergedMap = new HashMap<>(map1);

        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            K key = entry.getKey();
            int value = entry.getValue();
            mergedMap.put(key, mergedMap.getOrDefault(key, 0) + value);
        }

        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        System.out.println("Merged Map: " + mergedMap);
    }
}