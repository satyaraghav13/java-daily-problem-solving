import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40, 10};

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Step 2: Find element with highest frequency
        int maxElement = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Element with highest frequency: " + maxElement);
    }
}