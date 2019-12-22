package oops_05;

          // p

public class OverridingDemo1 {

	public void property()
	{
		System.out.println("cash+land+gold");
	}
	
	public void marriage()
	{
		System.out.println("kalpana");
	}	
}
         // c

class OverridingDemo2 extends OverridingDemo1{
	
	public void marry()
	{
	System.out.println("Deepu");	
	}
}


class Test1{
	public static void main(String[] args) {
		OverridingDemo1 a=new OverridingDemo1();
		a.marriage();
	}
}
