package collections_42;

import java.util.TreeSet;

import mutiThreading.MyThread1;

public class COmparatorInterFaceDemo1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet( new MyComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println(t);//[20, 15, 10, 0]
		

	}

}
