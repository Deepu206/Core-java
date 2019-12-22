/**
 * 
 */
package oops_05;

public class OverLoadingDemo1 {
	public void m1()
	{
	System.out.println("no-arg");
	}

	public void m2(int i)
	{
	System.out.println("int method ");
	}


	public void m3(float f)
	{
	System.out.println("float method");
	}

	public static void main(String[]args)
	{
		OverLoadingDemo1 a=new OverLoadingDemo1();
	               a.m1();
	               a.m2(1);
	               a.m3(1.1f);	
}
}
