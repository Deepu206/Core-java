package flowControls_03;

public class ForEachDemo1 {

	public static void main(String[] args) {
		
		/*int[] x={1,2,3,4,5};
		
		for (int i : x) {
			System.out.println(i);
		}*/
		
		int [][] x={{1,2,3,4,5,6},{2,3}};
		for (int[] x1 : x) {
			
			for (int x2 : x1) {
				System.out.println(x2);
			}
		}

	}

}
