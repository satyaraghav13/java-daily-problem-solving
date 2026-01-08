import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.add(arr[i])) {
                result.add(arr[i]);
            }
        }

        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

