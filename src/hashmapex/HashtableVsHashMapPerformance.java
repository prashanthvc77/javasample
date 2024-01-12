package hashmapex;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableVsHashMapPerformance {

    public static void main(String[] args) {
        final int NUM_ELEMENTS = 100;

        // Test Hashtable insertion time
        long startTimeHashtable = System.currentTimeMillis();
        Map<Integer, String> hashtable = new Hashtable<>();
        performInsertions(hashtable, NUM_ELEMENTS);
        long endTimeHashtable = System.currentTimeMillis();
        long totalTimeHashtable = endTimeHashtable - startTimeHashtable;
        System.out.println("Hashtable insertion time: " + totalTimeHashtable + " ms");

        // Test HashMap insertion time
        long startTimeHashMap = System.currentTimeMillis();
        Map<Integer, String> hashmap = new HashMap<>();
        performInsertions(hashmap, NUM_ELEMENTS);
        long endTimeHashMap = System.currentTimeMillis();
        long totalTimeHashMap = endTimeHashMap - startTimeHashMap;
        System.out.println("HashMap insertion time: " + totalTimeHashMap + " ms");

        // Compare the insertion times
        if (totalTimeHashtable < totalTimeHashMap) {
            System.out.println("Hashtable is faster than HashMap.");
        } else if (totalTimeHashtable > totalTimeHashMap) {
            System.out.println("HashMap is faster than Hashtable.");
        } else {
            System.out.println("Hashtable and HashMap have similar insertion times.");
        }
    }

    private static void performInsertions(Map<Integer, String> map, int numElements) {
        for (int i = 0; i < numElements; i++) {
            map.put(i, "Value" + i);
        }
    }
}

