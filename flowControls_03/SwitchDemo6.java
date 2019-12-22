package flowControls_03;

public class SwitchDemo6 {

	public static void main(String[] args) {
		
		// Duplicate values are not allowed in case if use we will get C.E=>Duplicate case
				int x=10;
		
		switch (x) {
		
		case 1:
			    System.out.println("c-1");
			    break;
			    
		case 2:
			   System.out.println("c-2");
			   break;
	
		case 97:
			   System.out.println("c-3");
			   break;
			   
		/*case 'a':
			   System.out.println("c-'a'");
			   break;
	  		   */

		default:
			     System.out.println("I am Default....");
			     break;
		}

	}

}
