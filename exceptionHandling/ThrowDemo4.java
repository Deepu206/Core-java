package exceptionHandling;

public class ThrowDemo4 {

	static ArithmeticException e;
	
	public static void main(String[] args) {
	throw e;	
	}

}
/*Exception in thread "main" java.lang.NullPointerException
at exceptionHandling.ThrowDemo4.main(ThrowDemo4.java:8)*/
