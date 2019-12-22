package exceptionHandling;

public class DefaultExceptionHandlingDemo2 {

	public static void main(String[] args) {
		doStuff();
	}
    public static void doStuff(){
	   doMoreStuff();
    }
    public static void doMoreStuff(){
	System.out.println(10/0);
    }

}

/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at exceptionHandling.EhDemo2.doMoreStuff(EhDemo2.java:12)
at exceptionHandling.EhDemo2.doStuff(EhDemo2.java:9)
at exceptionHandling.EhDemo2.main(EhDemo2.java:6)*/
