package exceptionHandling;

import java.io.*;

public class UncheckedExceptionDemo1  {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.println("Hello");
		System.out.println(10/0);

	}

}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at exceptionHandling.UncheckedExceptionDemo1.main(UncheckedExceptionDemo1.java:11)*/