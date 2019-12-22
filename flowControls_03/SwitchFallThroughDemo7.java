package flowControls_03;

public class SwitchFallThroughDemo7 {

	public static void main(String[] args) {
		
		int x=10;
		
		switch (3) {
		
		case 0:                                  //switch (0)=  c-0,c-1,c-2    
			   System.out.println("c-0");
			 
		case 1:                                  //switch (1)=c-1,c-2 
			   System.out.println("c-1");
			    
		case 2:                                  //switch (2)=c-2   
			  System.out.println("c-2");
			  break; 
		case 3:                                  //switch (3)=c-2  ,i am Default...
			  System.out.println("c-3");    
			  
		default:
			  System.out.println("i am Default...");
			    
		}
	}

}
