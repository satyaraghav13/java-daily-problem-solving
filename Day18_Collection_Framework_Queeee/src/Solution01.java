import java.util.*;

public class Solution01 {

    public static void main(String[] args) {

        List<Integer> salaries = new ArrayList<>(
                Arrays.asList(50000, 400000, 60000, 55000, 60000)
        );

        // Remove duplicates
        salaries = new ArrayList<>(salaries.stream().distinct().toList());

        // Sort in descending order
        Collections.sort(salaries, Collections.reverseOrder());

        
        if (salaries.size() >= 2) {
            System.out.println("Second Highest Salary: " + salaries.get(1));
        } else {
            System.out.println("Not enough salary data");
        }
    }
}

