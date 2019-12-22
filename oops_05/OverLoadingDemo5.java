package oops_05;

public class OverLoadingDemo5 {

	 public void m1(int i,float f)
	    {
	    	System.out.println("int-float");
	    }
	 
	 public void m1(float f,int i){
		 System.out.println("float-int");
	    }
	 
      public static void main(String[] args) {
   
		OverLoadingDemo5 a=new OverLoadingDemo5();
		a.m1(1,1.1f);
		a.m1(1.1f,1);
		/*a.m1(10,10);*/ //The method m1(int, float) is ambiguous for the type OverLoadingDemo5
		/*a.m1(1.11f,1.2f);*/ //	The method m1(float, int) in the type OverLoadingDemo5 is not applicable for the arguments (float, float)
        

		
	}

}
