import java.util.*;

public class AB {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,4,5,6,7,8,9,1,4,9,8,6};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for(int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print unique
        for(int num : map.keySet()) {
            if(map.get(num) == 1) {
                System.out.println("Unique: " + num);
            }
        }
    }
}