package max.bo;

import java.util.Random;

import max.bean.EmpBean;
import max.dao.EMPDAO;
import max.dto.EmpDTO;

public class EmpBO {
 public static String id()
 {
	 StringBuffer sb = new StringBuffer();
	 for(int i=0;i<=9;i++)
	 {
		sb=sb.append(new Random().nextInt(10));
	 }
	return sb.toString();
	 
 }
	
	public void getEmpDetail(EmpBean empBean)
	{
		String act = empBean.getAcount();
		
		act=act.length()>=8?act:"000000";
		String name = empBean.getName();
name=name.substring(0, 1).toUpperCase()+name.substring(1).toLowerCase();
   String ifsc = empBean.getIfsc().toUpperCase();
   
   EmpDTO empDTO=new EmpDTO();
   empDTO.setName(name);
   empDTO.setAcount(act);
   empDTO.setIfsc(ifsc);
   //String iddd = id();
   empDTO.setTid(id());
   
   EMPDAO eMPDAO=new EMPDAO();
   eMPDAO.getEmpDAO(empDTO);
	}
	
	
	
}