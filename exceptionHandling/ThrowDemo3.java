package exceptionHandling;

import declarationsAndAccessModifiers_04.StaticImportDemo5;

public class ThrowDemo3 {  

	static ArithmeticException e=new ArithmeticException();
	
	public static void main(String[] args) {
		
      throw e;
      
	}

}
/*Exception in thread "main" java.lang.ArithmeticException
at exceptionHandling.ThrowDemo3.<clinit>(ThrowDemo3.java:7)*/