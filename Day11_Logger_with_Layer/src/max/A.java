package max;

public class A {
public void add(int a, int b)
{
	System.out.println("add "+(a+b));
}
public void div(int a, int b)
{
	try
	{
	int c=a/b;
	System.out.println("Div "+c);
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.exit(0);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally{
		System.out.println("finally");
	}
}
public void mul(int a, int b)
{
	System.out.println("mul "+(a*b));
}
public static void main(String[] args) {
	A ob=new A();
	ob.add(3, 4);
	ob.div(8, 0);
	ob.mul(2, 4);
}
}
