package arrays_4;

public class ArrayCreation1 {

	public static void main(String[] args) {
		//To identify the corresponding class of a ArrayObject-single dimensional
		int[] a=new int[3];
		System.out.println(a.getClass().getName());

		//To identify the corresponding class of a ArrayObject-two dimensional
				int[][] b=new int[3][2];
				System.out.println(b.getClass().getName());
	}

}
