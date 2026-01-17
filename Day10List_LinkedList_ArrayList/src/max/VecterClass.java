package max;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VecterClass {
public static void main(String[] args) {
	    Vector<String> v = new Vector<String>();
	    v.add("B");
	    v.add("H");
	    v.add("A");
	    
	   Enumeration<String> e = v.elements();
	    
	    while(e.hasMoreElements())
	    {
	    	String w = e.nextElement();
	    	System.out.println(w);
	    }
	    System.out.println("------");
	   Iterator<String> it = v.iterator();
	    while(it.hasNext())
	    {
	    	 String p = it.next();
	    	 System.out.println(p);
	    }
}
}