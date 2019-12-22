package flowControls_03;

public class DoWhileDemo2 {

	public static void main(String[] args) {
     
		/* 1
		 do	
		while (true)
			System.out.println("hello");            //infinite loop
		while (false); 
	   */
		
		/* 
		 do {
			System.out.println("hello");
		} while (true);
		System.out.println("hi");                    //Unreachable code
		*/                
		
		/* 1
		 do {
			System.out.println("hello1");
		} while (true);
		System.out.println("hello2");               //Unreachable code
		
		*/
		
	
		 /* 2
		  do {
			System.out.println("hai1");           // hai1
                                                  // hai2
		} while (false);
		    System.out.println("hai2");
		    
		  */
		 
		   /*  3
		    int a=10,b=20;                            //infinite loop
		    do {
				System.out.println("hello");
			} while (a<b);
		        System.out.println("hai");
		        
		    */
		
		
		   /* 4
		    int a=10,b=20;                              hello
		                                                hai
		    do {
				System.out.println("hello");
			} while (a>b);
		        System.out.println("hai");
	       */
		
		
		   /* 5
		   final int a=10,b=20;
		   do {
			System.out.println("hai1");
		    } while (a<b);
		    System.out.println("hello2");       //Unreachable code
		    */
		    
		  /* 6
		  final int a=1,b=2;
		  do {                                         hai1
		                                               hai2
			System.out.println("hai1");
		   } while (a>b);
		  System.out.println("hai2");
		  
		  */
	}
}
