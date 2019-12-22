package collections_42;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println("Vector Default capacity:"+v.capacity());
		for (int i = 1; i <=10; i++) {
			v.add(i);
		}
		System.out.println("Capacity after adding 10 elements:"+v.capacity());
		
		v.add("A");
		System.out.println("Vector Incremental capacity:"+v.capacity());
		System.out.println(v);
	}

}
