package exceptionHandling;


public class TryMultipleCatchBlocksDemo1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println(10/2);
			System.out.println("handled by Ae");
		}catch (Exception e) {
			System.out.println("handled by Exception");
		}
	}

}
/*5
handled by Ae
*/