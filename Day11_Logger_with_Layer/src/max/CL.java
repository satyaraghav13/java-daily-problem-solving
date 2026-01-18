package max;

import org.apache.log4j.Logger;

public class CL {
	static Logger log=Logger.getLogger(B.class);
public static void main(String[] args) {
	B ob=new B();
	
	try {
		while(true){
		String r = ob.div(8, 2);
		System.out.println(r);
		log.fatal("By "+r);
		}
	} 
	catch (B e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		log.error("By Rahul "+e.getMessage());
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
