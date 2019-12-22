package declarationsAndAccessModifiers_04;

public class B1 extends A1{

public static void main(String[] args) {
				
		A1 a=new A1();
		a.m1();
				
	 B1 b=new B1();
		b.m1();
				
	   A1 z=new B1();
		z.m1();
		
			}
	}


