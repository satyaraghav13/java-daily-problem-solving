import java.util.LinkedHashMap;
import java.util.Map;

public class Solution02 {

    public static void main(String[] args) {

        String input = "swiss";

        // Step 1: convert to lowercase (case-insensitive)
        input = input.toLowerCase();

        // Step 2: create LinkedHashMap to maintain insertion order
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Step 3: traverse string character by character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Step 4: find first non-repeating character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
