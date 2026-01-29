import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution01 {
    public static void main(String[] args) {

   
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

    
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        
        System.out.println("ArrayList element at index 1: " + arrayList.get(2));
        System.out.println("LinkedList element at index 1: " + linkedList.get(1));
    }
}
