package oops_05;

public class OverLoadingDemo6 {

	public void m1()
	{
		System.out.println("no-arg");
	}
	public void m1(int i){
		System.out.println("General method");  //1.0v
	}
	public void m1(int...r){
		System.out.println("Var-arg method");  //1.5v
	}
	public static void main(String[] args) {
		OverLoadingDemo6 o6=new OverLoadingDemo6();
		o6.m1();
		o6.m1(1,1);
		o6.m1(10);
		

	}

}
