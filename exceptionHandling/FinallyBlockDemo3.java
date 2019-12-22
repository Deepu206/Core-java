package exceptionHandling;

public class FinallyBlockDemo3 {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.out.println(10/0);
		} catch (NullPointerException e) {
			System.out.println("catch");
		}finally{
			System.out.println("finally");
		}

	}

}
/*try
finally
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exceptionHandling.FinallyBlockDemo3.main(FinallyBlockDemo3.java:8)*/