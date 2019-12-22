package collections_42;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("balayya");
		ll.add("chiru");
		ll.add("venky");
		ll.add("nag");
		System.out.println(ll);
		ListIterator itr=ll.listIterator();
		
		while (itr.hasNext()) {
			String s=(String) itr.next();
			if (s.equals("venky")) {
				itr.remove();
			}else if (s.equals("nag")) {
				itr.add("Chaitu");
			}else if (s.equals("chiru")) {
				itr.set("charan");
			}			
		}
		System.out.println(ll);
	}

}
