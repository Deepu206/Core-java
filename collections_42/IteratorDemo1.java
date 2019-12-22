package collections_42;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		for (int i = 0; i <=10; i++) {
			l.add(i);
		}
		System.out.println(l); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		Iterator itr=l.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer)itr.next();
			if (n%2==0) 
				System.out.println(n);
			}
			System.out.println(l);
		}

	}


