package flowControls_03;

public class SwitchDemo4 {

	public static void main(String[] args) {
		
	//Every case label should be with in the range of switch argument other wise we will get C.E
	
		byte  b=10;                         //byte range=-128 to 127
		
		switch (b) {
		case 1:
			    System.out.println("C-1");
			    break;
			    
		case 100:
			    System.out.println("C-100");
			    break;
			    
		case -128:
			    System.out.println("C-127");
			    break;
			    
		case 127:
      			System.out.println("C-128");
      			break;
      			
		/*case 128:                                  //Type mismatch: cannot convert from int to byte
			    System.out.println("C-129");
			    break;*/
			    
		default:
			   System.out.println("I am Default....");
			   break;
		}
	}
}
