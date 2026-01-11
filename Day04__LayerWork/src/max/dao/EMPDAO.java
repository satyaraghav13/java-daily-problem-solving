package max.dao;

import max.dto.EmpDTO;

public class EMPDAO {
public void getEmpDAO( EmpDTO empDTO)
{
	System.out.println(empDTO.getAcount()+" "+empDTO.getIfsc()+" "+empDTO.getName()+" tid "+empDTO.getTid());
}
}
