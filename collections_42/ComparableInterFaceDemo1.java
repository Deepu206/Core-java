package collections_42;

public class ComparableInterFaceDemo1 {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("B"));
        System.out.println("A".compareTo("A"));
       System.out.println("A".compareTo(null));//java.lang.NullPointerExceptionl
	}

}
