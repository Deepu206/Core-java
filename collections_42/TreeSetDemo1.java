package collections_42;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet s=new TreeSet(); 
s.add("A");
s.add("a");
s.add("B");
s.add("Z");
s.add("L");
//s.add(new Integer(10));//java.lang.ClassCastException
//s.add(null);//java.lang.NullPointerException
System.out.println(s);//[A, B, L, Z, a]

	}

}
