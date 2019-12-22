package variables_5;

public class LocalVariableDemo6 {

	public static void main(String[] args) {
		int x;
		
		if (args.length>0) {
			x=1;
		} else {
            x=2;
		}
         System.out.println(x);
	}

}

