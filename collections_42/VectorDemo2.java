package collections_42;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {

      Vector v=new Vector(25);
      System.out.println("initial capacity setted is:"+v.capacity());//25
      for (int i = 1; i <=10; i++) {
		v.addElement(i);	
	}
      System.out.println("capacity after adding 10 elements:"+v.capacity()); //25
      v.add("App");
      System.out.println(v.capacity());//25
      System.out.println(v);
	}

}
