import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution01 {

    public static Character firstNonRepeating(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Character result = firstNonRepeating(input);

        if (result != null) {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No unique character found");
        }

        sc.close();
    }
}
