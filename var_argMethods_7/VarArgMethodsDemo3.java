package var_argMethods_7;

public class VarArgMethodsDemo3 {
	
	public static void sum(int...x){
		
		int total=0;
		
		for (int i : x) {
			
			total=total+i;
			
		}
		System.out.println("the sum:"+total);
	}

	public static void main(String[] args) {
		
                sum();
                sum(1,2);
                sum(1,2,3);
                sum(1,2,3,4);
	}

}
