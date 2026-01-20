package set;

import java.util.HashSet;
import java.util.Set;

public class EMLCL {
public static void main(String[] args) {
	EmpSet empSet=new EmpSet();
	Set<Emp> s1=new HashSet<Emp>();
	Set<Emp> s = empSet.getEmpDetail();
	 for( Emp p: s)
	 {
	 System.out.println(p.getEid()+" "+p.getName());
		 
		  
		  }
	
}
}
