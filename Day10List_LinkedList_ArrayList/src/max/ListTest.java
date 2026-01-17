package max;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//wait 2 mint
public class ListTest {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	  l.add("2");
	  l.add("raja");
	  l.add("3.9f");
	  l.add("arun");
	  l.add("20");
	  System.out.println("before "+l.size());
	  
	  for(String  p: l)
	  {
		  System.out.println(p);
	  }
	  
	  System.out.println("after "+l.size());
}
}
