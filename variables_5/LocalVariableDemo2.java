package variables_5;

public class LocalVariableDemo2 {

	public static void main(String[] args) {
		
		try {
			int j=Integer.parseInt("ten");
			
		} catch (NumberFormatException e) {
			
			/*j=0;*/                  //c.e=j cannot be resolved to a variable
			
		}
		
     /* System.out.println(j);*/     //c.e=j cannot be resolved to a variable
	}

}
