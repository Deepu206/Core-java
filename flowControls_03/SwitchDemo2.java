package flowControls_03;

public class SwitchDemo2 {

	public static void main(String[] args) {
	
		/*int x=10;
		  int b=2;
		
		
		switch (x) {
		case 1:
			   System.out.println(10);
			   break;
	
		case b:                             //case expressions must be constant expressions
			   System.out.println("A");
			   break;
			   
		default:
			    System.out.println("Default");
			    break;
		}*/
		
		int x=10;
		 final int b=2;
		
		switch (x) {
		case 1:
			    System.out.println("A for Apple");
			    break;
	
		case b:                                 //we declare a variable as final we wont get case expressions must be constant expressions
			   System.out.println("B for Bat");
			    break;

		default:
			   System.out.println("I am Default");
			   break;
		}
	}

}
