package set;

import java.util.HashSet;
import java.util.Set;

public class EmpSet {
public  Set<Emp> getEmpDetail()
{
	  Set<Emp> s=new HashSet<Emp>();
	  Emp emp = new Emp();
	  emp.setEid(11);
	  emp.setName("bala");
	  s.add(emp);
	  Emp emp1 = new Emp();
	  emp1.setEid(11);
	  emp1.setName("bala");
	  s.add(emp1);
	  
	  Emp emp2 = new Emp();
	  emp2.setEid(12);
	  emp2.setName("ala");
	  s.add(emp2);
	return s;
}
}
