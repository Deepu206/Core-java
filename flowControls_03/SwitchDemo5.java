package flowControls_03;

public class SwitchDemo5 {

	public static void main(String[] args) {
		
		byte b=10;
		
		switch (b+1) {
		
		case 1:
			    System.out.println("c-1");
			    break;
			   
		case 100: 
			    System.out.println("c-100");
			    break;
			    
		case 1000:
			      System.out.println("c-1000");
			      break;   

		default:
			      System.out.println("My name is Default.....");
			      break;
		}

	}

}

