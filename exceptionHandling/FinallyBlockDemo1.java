package exceptionHandling;

public class FinallyBlockDemo1 {

	public static void main(String[] args) {

try {
	System.out.println("try");
} catch (Exception e) {
	System.out.println("catch");
}finally{
	System.out.println("finally");
}
System.out.println("Bye.............!");
	}

}
