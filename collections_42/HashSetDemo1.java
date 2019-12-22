package collections_42;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
       h.add("B");
       h.add("C");
       h.add("D");
       h.add("Z");
       h.add(null);
       System.out.println(h.add("Z"));//false
       System.out.println(h);//[null, D, B, C, Z]
	}

}
