package flowControls_03;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		/*
		 for (int i = 0; true; i++) {
			System.out.println("hello");
		}
             System.out.println("hi");             //Unreachable code
	   */
		
		/*
		 for (int i = 0; false; i++) {
			System.out.println("hello");           //Unreachable code
		}
		System.out.println("hi");
		
		*/
		
		
		 /*for (int i = 0;; i++) {
			System.out.println("h1");
		}
		System.out.println("h2");                    //Unreachable code
		*/
		
		/*
		 for (int i = 0; false; i++) {
			System.out.println("Apple");              //Unreachable code
		}
		System.out.println("dare");
		*/
		
		/*int a=10,b=20;
		for (int i = 0; a < b; i++) {
			System.out.println("app");               //infinite loop
		}
		    System.out.println("app2");
		    */
		    
		/*final int a=10,b=20;
		for (int i = 0; a < b; i++) {
			System.out.println("like");
		}
		System.out.println("unlike");                //Unreachable code
		*/
		
		/*final int a=1,b=2;
		for (int i = 0; a >b; i++) {
			System.out.println("jack");	             //Unreachable code
		}
	System.out.println("jil");
	*/
	}
}
