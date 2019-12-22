package flowControls_03;

public class BreakDemo1 {

	public static void main(String[] args) {
		
		// inside switch

		/*
		 switch (0) {
		case 0:System.out.println("C-0");
		       break;
		    
		case 1:System.out.println("C-1");
	           
		case 2:System.out.println("C-2");
	           
		case 3:System.out.println("C-3");
	           
		
		default:System.out.println("Default");
			break;
		}
		
		*/
		
		// inside loops
		
		
		 /*for (int i = 0; i < 10; i++) {
			if(i==6)
			
			break;
			System.out.println(i);
		}*/
		
		// inside labled blocks
		
		/*
		int x=10;
		l1:
		{
			System.out.println("begin");
			if(x==10)
				break l1;
			System.out.println("end");
		}
		System.out.println("bye");
		
		*/
		
		/*
		 int x=10;
		if(x==10)
			break;                  //break cannot be used outside of a loop or a switch
		System.out.println("hyd");
		*/
	}

}
