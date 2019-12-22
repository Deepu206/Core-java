package collections_42;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("Deepu");
		l1.add(30);
		l1.add(null);
		l1.add("Durga");
		System.out.println(l1);
		l1.set(0, "Software");
		l1.set(0, "venky");
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.addFirst("Divya");
		System.out.println(l1);
	}

}
