package oops_05;

public class OverLoadingDemo7 {

	public void m1(Animal a)
	{
		System.out.println("Animal-vertion");
	}
	public void m1(Monkey m)
	{
	System.out.println("Monkey-vertion");	
	}
	
	public static void main(String[] args) {
		
		OverLoadingDemo7 o7=new OverLoadingDemo7();
		Animal a=new Animal();
		o7.m1(a);
		
		Monkey m=new Monkey();
		o7.m1(m);
		
		Animal a1=new Monkey();
		o7.m1(a1);
	}

}


