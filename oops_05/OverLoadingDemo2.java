package oops_05;

public class OverLoadingDemo2 {
	
	public void m1(int i)
	{
	System.out.println("method:int");
	}

	public void m2(float i)
	{
	System.out.println("method:float");
	}

	public static void main(String[]args){

	OverLoadingDemo2 a=new OverLoadingDemo2();
	a.m1(1);
	a.m2(1.1f);
    a.m1('f');
    //a.m1(10l);
	}
}

