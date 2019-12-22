package exceptionHandling;

public class MethodsToPrintExceptionInfoDemo1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
		/*	e.printStackTrace(); */                 //java.lang.ArithmeticException: / by zero
			                                        //name of class ...etc
			/*System.out.println(e.toString());*/       //java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage());         /// by zero
		}
	
	System.out.println("Bye......!");

	}

}
