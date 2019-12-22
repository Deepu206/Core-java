package exceptionHandling;

public class ThrowDemo5 {

	public static void main(String[] args) {
		/*System.out.println(10/0);
		System.out.println("Hello");*/

		throw new ArithmeticException("/ by zero");
		/*System.out.println("hai");*/
	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Unreachable code at exceptionHandling.ThrowDemo5.main(ThrowDemo5.java:10)*/