import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution01{

    public static void main(String[] args) {

        List<Object> l = new ArrayList<>();

        l.add(2);
        l.add("raja");
        l.add(3.9f);
        l.add("arun");
        l.add(20);

        // =========================
        // Normal for loop
        // =========================
//        System.out.println("before " + l.size());
//
//        for (int i = 0; i < l.size(); i++) {
//            Object p = l.get(i);
//            System.out.println(p);
//            // l.remove(i); // allowed but index issue
//        }
//
//        System.out.println("after " + l.size());

        // =========================
        // Iterator
        // =========================
        System.out.println("==Iterator==");

        Iterator<Object> it = l.iterator();
        while (it.hasNext()) {
            Object q = it.next();
            System.out.println(q);
             it.remove(); // safe removal
        }

        // =========================
        // for-each loop (jdk 1.5)
        // =========================
//        System.out.println("for each");
//
//        for (Object p : l) {
//            System.out.println(p);
//             l.remove(p); // NOT allowed
//        }

        System.out.println("final size " + l.size());
    }
}
