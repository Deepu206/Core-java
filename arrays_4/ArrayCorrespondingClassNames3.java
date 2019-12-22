package arrays_4;

public class ArrayCorrespondingClassNames3 {

	public static void main(String[] args) {
		
		System.out.println("ArrayType corresponding ClassNames..........");
		
		                    //1 Dimentional
		
		byte[] b=new byte[1];	
		System.out.println("byte:"+b.getClass().getName());
		
		short[] s=new short[1];
		System.out.println("short:"+s.getClass().getName());
		
		int[] i=new int[1];
		System.out.println("int:"+i.getClass().getName());
		
		long[] l=new long[1];
		System.out.println("long:"+l.getClass().getName());
		
		float[] f=new float[1];
		System.out.println("float:"+f.getClass().getName());
		
		double[] d=new double[1];
		System.out.println("double:"+d.getClass().getName());
		
		char[] c=new char[1];
		System.out.println("char:"+c.getClass().getName());
		
		String[] s1=new String[1];
		System.out.println("string:"+s1.getClass().getName());
		 
		//2-Dimentional
		
		byte[][] b2=new byte[2][];	
		System.out.println("byte2:"+b2.getClass().getName());
		
		//3-Dimentional
		
	   byte[][][] b3=new byte[2][][];	
   	   System.out.println("byte2:"+b3.getClass().getName());
	
	}

}
