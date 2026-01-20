package set;

import java.util.Iterator;
import java.util.Set;

public class CL {
	public static void main(String[] args) {
		SetTest setTest=new SetTest();
		Set<String> s = setTest.getData();
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
			String p = it.next();
			System.out.println(p);
		}
		System.out.println("---for each---");
		
		 for(  String p: s)
		 {
			 System.out.println(p);
		 }
	}
}
