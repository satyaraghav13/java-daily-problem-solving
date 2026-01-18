package max;

import org.apache.log4j.Logger;

public class B extends Exception{
	static Logger log=Logger.getLogger(B.class);
	B(){}
	B(String s)
	{
		super(s);
	}
public String mul(int a,int b)throws B,Exception
{
	if(a!=0 && b==0) //throw throws
	{
		throw new B(ProUtility.getValueee("b"));
	}
	else if(a==0 && b!=0)
	{
		throw new B(ProUtility.getValueee("a"));
	}
	else if(a==0 && b==0)
	{
		throw new B(ProUtility.getValueee("ab"));
	}
	else
	{
		int c=a*b;
		return "MUL "+c;
	}
}


public String div(int a, int b)throws B
{
	if(b!=0)
	{
		int c=a/b;
		return "Div "+c;
	}
	else
	{
		log.error(ProUtility.getValueee("div")+" input a"+a+" b "+b);
		throw new B(ProUtility.getValueee("div"));
	}
}
	
public void generateAdharByAge(int age)
{
	//18  60  12 
}

public void generateAdharByDOB(String dob)//01-05-1986
{
	
	//18  60  12 
}

}
