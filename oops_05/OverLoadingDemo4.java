package oops_05;

public class OverLoadingDemo4 {

	public void m1(String s){
		System.out.println("String vertion");
	}
	public void m1(StringBuffer sb){
		System.out.println("String Buffer method");
	}
	
	public static void main(String[] args) {
		
OverLoadingDemo4 o5=new OverLoadingDemo4();
                 o5.m1("Deepu");
                 o5.m1(new StringBuffer("Deepu"));
                 /*o5.m1(null);*/         //The method m1(String) is ambiguous for the type OverLoadingDemo4
	}

	
}
