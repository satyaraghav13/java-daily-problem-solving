package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public Set<String> getData()
	{
		//Set<String> s=new HashSet<String>();
		//Set<String> s=new LinkedHashSet<String>();
		Set<String> s=new TreeSet<String>();
		s.add("A");//11
		s.add("B");//12
		s.add("P");//11
		s.add("D");
		return s;
	}
	
	
	
}
