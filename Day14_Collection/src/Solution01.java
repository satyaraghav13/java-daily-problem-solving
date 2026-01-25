import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

public class Solution01 {
    public static void main(String[] args) {

        Map<String, Integer> m = new HashMap<String, Integer>();

        // inserting values
        m.put("a", 1000); // o1
        m.put("b", 1200); // o2
        m.put("q", 1100); // o3
        m.put("d", 1000); // o4
        m.put("k", 1300); // o5

        // Convert map to set of entries
        Set<Entry<String, Integer>> s = m.entrySet();

        // 1️⃣ Using for-each loop
        for (Entry<String, Integer> q : s) {
            System.out.println(q.getKey() + " value " + q.getValue());
        }

        System.out.println("------ for each ------");

        // 2️⃣ Using Iterator
        Iterator<Entry<String, Integer>> it = s.iterator();
        while (it.hasNext()) {
            Entry<String, Integer> p = it.next();
            String k = p.getKey();
            Integer v = p.getValue();
            System.out.println(k + " " + v);
        }
    }
}