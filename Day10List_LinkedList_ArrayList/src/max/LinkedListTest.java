package max;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("A");
	l.add("A");
	l.add("A");
	l.add("B");
	l.add(1, "Z");
	System.out.println(l);
	l.addFirst("W");
	System.out.println(l);
}
}
