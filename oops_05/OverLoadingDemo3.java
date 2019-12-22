package oops_05;

public class OverLoadingDemo3 {

	public void m1(String s){
		System.out.println("String vertion");
	}
	
	public void m1(Object o){
		System.out.println("Object vertion");
	}
	public static void main(String[] args) {
		OverLoadingDemo3 c=new OverLoadingDemo3();
		c.m1(new Object());
		c.m1("Divya");
		c.m1(null);
		

	}

}
