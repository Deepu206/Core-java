package var_argMethods_7;

public class VarArgMethodsDemo1 {

	public static void m1(int...x){
		System.out.println("This is var-arg method");
	}
	
	public static void main(String[] args) {
		
        m1();
        m1(10,20);
        m1(10,20,30);
        m1(10,20,30,40,5,5,6,6,7,7,8,9);
	}

}
