package exceptionHandling;

public class ThrowDemo2 {

	public static void main(String[] args) {
		throw new ArithmeticException("/ by Zero");
		

	}

}

/*Exception in thread "main" java.lang.ArithmeticException: / by Zero
at exceptionHandling.ThrowDemo2.main(ThrowDemo2.java:6)*/
