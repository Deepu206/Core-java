package flowControls_03;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		/* 1
		 while (true) {
			System.out.println("in while");
		 }
            System.out.println("out of while");  //Unreachable code
            
            */
		
		
		
		/* 2
		 while (false) {
			System.out.println("hai");	         //Unreachable code
		}
		System.out.println("hi");*/
		
		
		/* 3
		int a=1;
		int b=2;
		while (a<b) {
			System.out.println("Hai");//Hai infinite loop
		}
		   System.out.println("hi");
	    */
		
		/* 4
		int a=1;
		int b=2;
		while (a>b) {
			System.out.println("Hai");//hi 
		}
		   System.out.println("hi");*/
		
		/* 5
		   final int a=1;
		   final int b=2;
		   while (a<b) {
			System.out.println("Hai"); //Unreachable code
		}
		   System.out.println("hi");*/
		
		 /* 6
		    final int a=1;
			final int b=2;
			while (a>b) {
				System.out.println("Hai"); //Unreachable code
			}
			    System.out.println("hi");*/
		
		
		
	}
}
