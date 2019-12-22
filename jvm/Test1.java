package jvm;

import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
    
		int count=10;
		
     Class c=Class.forName("student");
      Method[] m=c.getDeclaredMethods();
      for (Method m1 : m) {
		
    	  count ++;
    	  System.out.println(m1.getName());
    	  
	}
      System.out.println(count);


	}

}
