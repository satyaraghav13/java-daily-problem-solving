import java.util.HashSet;
import java.util.Set;

public class Solution01 {

    public static void main(String[] args) {

        String sentence = "The quick brown fox jumps over the lazy dog";

       
        sentence = sentence.toLowerCase();

        //  create a Set to store unique alphabets
        Set<Character> set = new HashSet<>();

      
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

        
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

      
        if (set.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}
