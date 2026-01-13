import java.util.HashMap;
import java.util.Map;

public class Solution01 {

    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";

        // Step 1: convert to lowercase (case-insensitive)
        sentence = sentence.toLowerCase();

        // Step 2: split sentence into words
        String[] words = sentence.split(" ");

        // Step 3: create HashMap to store word frequency
        Map<String, Integer> map = new HashMap<>();

        // Step 4: traverse words
        for (String word : words) {

            if (map.containsKey(word)) {
                // Step 5: word already exists → increase count
                map.put(word, map.get(word) + 1);
            } else {
                // Step 6: new word → add with count 1
                map.put(word, 1);
            }
        }

        // Step 7: print result
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
