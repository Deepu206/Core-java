package collections_42;

import java.util.Vector;

public class VectorDemo3 {

	public static void main(String[] args) {
		Vector v=new Vector(10,5);
		System.out.println("initial capacity:"+v.capacity());
		for (int i = 1; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println("capacity after adding 10 elements:"+v.capacity());
		v.add("queen");
		System.out.println("Incremental capacity:"+v.capacity());
		System.out.println(v);
	}
	

}
