package variablesUnInitializesArrays_6;

public class Ex2 {

	int[] x;
	
	public static void main(String[] args) {
		
    Ex2 a=new Ex2();
    System.out.println(a.x);
    System.out.println(a.x[0]);//R.E=java.lang.NullPointerException
    
	}

}

