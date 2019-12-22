package oops_05;

public class MethodSignatureDemo1 {
	public void m1(int i)
	{
      System.out.println("Int method");
	}

	public void m2(String v)
	{
       System.out.println("String method");
	}
	public static void main(String[] args) {
		MethodSignatureDemo1 a=new MethodSignatureDemo1();
		a.m1(1);
		a.m2("Divya");
		/*a.m3(1.6);*/                //The method m3(double) is undefined for the type Test

	
	}

}
