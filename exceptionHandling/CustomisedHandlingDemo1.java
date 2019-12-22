package exceptionHandling;

public class CustomisedHandlingDemo1 {         //abnormal termination

	public static void main(String[] args) {
		
		System.out.println("State-1");
		System.out.println(10/0);         /*State-1
		                                    Exception in thread "main" java.lang.ArithmeticException: / by zero*/
        System.out.println("State-2");
	}

}

