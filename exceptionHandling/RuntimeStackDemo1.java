package exceptionHandling;

public class RuntimeStackDemo1 {

	public static void main(String[] args) {
		dostuff();
	}
 public static void dostuff(){
	 domoreStuff();
 }
 public static void domoreStuff(){
	 System.out.println("Don't sleep.....!");
 }
}
