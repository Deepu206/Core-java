package exceptionHandling;

public class CustomisedHandlingDemo2 {    //normal termination

public static void main(String[] args) {

System.out.println("State-1");

try {
	System.out.println(10/0);
} catch (Exception e) {
	System.out.println(10/2);
}
System.out.println("State-3");

	}

}
