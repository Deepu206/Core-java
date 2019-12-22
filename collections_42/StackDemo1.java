package collections_42;

import java.util.Stack;

public class StackDemo1 {

	public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        
        s.peek();
        //System.out.println(s.search("A"));
        //System.out.println(s.search("Z"));
	}

}
