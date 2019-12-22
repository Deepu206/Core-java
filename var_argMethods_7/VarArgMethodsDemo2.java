package var_argMethods_7;

public class VarArgMethodsDemo2 {
	
public static void lengthMethod(int...x){
	
	System.out.println("Length:"+x.length);
}
	public static void main(String[] args) {
    
		lengthMethod();
		lengthMethod(1);
		lengthMethod(1,2);
		lengthMethod(1,2,3,4,5);
		

	}

}