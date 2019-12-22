package exceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomExceptionDemo {
	
public static void main(String[] args) throws Exception{
	/*int age=Integer.parseInt(args[0]);*/
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter age:");
	String input=br.readLine();
	int age=Integer.parseInt(input);
	
	
	if (age>=60) {
		throw new TooYoungException("u wont get matches ....");
	}else if(age<=50) {
		throw new TooOldException("u will get match soon...");
	}else {
		System.out.println("u will get info to mail...");
	}
	
}
}
