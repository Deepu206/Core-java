package variablesUnInitializesArrays_6;

public class InstanceLevels3 {
	
	     
	int[] x;
	

	public static void main(String[] args) {
		
		InstanceLevels3 s=new InstanceLevels3();
		
		           //Instance Levels
		System.out.println("Instance Level:"+s.x);
		System.out.println("Instance Level:"+s.x[0]);//R.E=java.lang.NullPointerException
		
		int[] y=new int[1];
		System.out.println(s.x);
		System.out.println(s.x[0]);
		
		
	}

}
