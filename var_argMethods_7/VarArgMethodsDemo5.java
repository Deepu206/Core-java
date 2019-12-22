package var_argMethods_7;

public class VarArgMethodsDemo5 {

	public static void m1(int...x){
		System.out.println("var-agr method");
	}
	
	public static void m1(int x){
		System.out.println("General method");
	}
	public static void main(String[] args) {
		
       m1();
       m1(1);
       m1(1,2);
       m1(1,2,3);
	}

}
