import java.util.Arrays;
import java.util.List;

public class Solution01 {

    public static void main(String[] args) {

        // Batch Data
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int total = 0;

        // Processing Batch
        for (int num : numbers) {
            total += num;
        }

        System.out.println("Total Sum: " + total);
    }
}