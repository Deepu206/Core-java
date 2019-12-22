package collections_42;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator ite=v.iterator();
		
		ListIterator itr=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());

	}

}
