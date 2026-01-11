package max.cl;

import java.util.Scanner;

import max.bean.EmpBean;
import max.bo.EmpBO;

public class CL {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
   System.out.println("Enter Name");
   String name = s.nextLine();
	System.out.println("Acount No");
	String ac = s.nextLine();
	System.out.println("IFSC");
	String ifsc = s.nextLine();
	
	EmpBean empBean=new EmpBean();
	empBean.setName(name);
	empBean.setAcount(ac);
	empBean.setIfsc(ifsc);
	EmpBO empBO=new EmpBO();
	empBO.getEmpDetail(empBean);
}
}
