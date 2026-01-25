import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        // Step 1: Convert to lowercase (case-insensitive)
        sentence = sentence.toLowerCase();

        // Step 2: Split sentence into words
        String[] words = sentence.split(" ");

        // Step 3: Use HashMap to store word frequencies
        Map<String, Integer> map = new HashMap<>();

        // Step 4: Count each word
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Step 5: Print result
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}