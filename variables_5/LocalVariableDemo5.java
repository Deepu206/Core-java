package variables_5;

public class LocalVariableDemo5 {

	public static void main(String[] args) {
		int x;
		
		if (args.length>0) {
			x=10;
		//	System.out.println(x);
		}
		
		/*System.out.println(x);*/       //The local variable x may not have been initialized

	}

}
