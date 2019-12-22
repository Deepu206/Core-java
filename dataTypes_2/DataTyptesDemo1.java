package dataTypes_2;

public class DataTyptesDemo1 {

	public static void main(String[] args) {
		
		           //byte
		
		byte b1=-128;
		byte b2=127;
	  /*byte d=128;*/                   //Type mismatch: cannot convert from int to byte
	  /*byte b3=10.5;  */               //Type mismatch: cannot convert from double to byte  
	  /*byte b6=true; */                //Type mismatch: cannot convert from boolean to byte
		
		           //short
		
		short s1=-32768;
		short s2=32767;
		/*short s3=32768;*/             //Type mismatch: cannot convert from int to short
		/*short s4=10.5;*/              //Type mismatch: cannot convert from double to short
		/*short s5=true;*/              //Type mismatch: cannot convert from boolean to short
		
			      //int
		
		int i1=-2147483648;
		int i2=2147483647;
		/*int i3=2147483648;*/              //The literal 2147483648 of type int is out of range 
		/*int i4=10.5;*/                    //Type mismatch: cannot convert from double to int
		/*int i5=true; */                   //Type mismatch: cannot convert from boolean to int

		          //boolean
		 
		boolean b=true;
		/*boolean bg=True;*/             //True cannot be resolved to a variable
		/*boolean bo=0;*/               //Type mismatch: cannot convert from int to boolean
		
		
		         //case1
		
		int s=0;
		 /*
		 if(s){                         //Type mismatch: cannot convert from int to boolean
			 System.out.println("hi");
		 }
		 else{
			 System.out.println("hello");
		 }*/
               		
		       //case2
		
		/*whlie(s){                                 //c.e
			System.out.println("hello....");
		}*/

	}

}
