package flowControls_03;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		int x=10;
		switch (x+1) {     //switch argument&case label can b expressions but case label should be constant expression
		
		case 1:
			    System.out.println("App");
			    break;
			    
		case 1+2:
			     System.out.println("Beep");
			     break;

		default:
			     System.out.println("I am Default......");
			     break;
		}
	}
}
