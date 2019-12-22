package variables_5;

public class StaticVariablesDemo4 {

	static int x=10;
	int y=20;
	
	public static void main(String[] args) {
		
		
		StaticVariablesDemo4 t1=new StaticVariablesDemo4();
		t1.x=888;
		t1.y=999;
		
		System.out.println("x:"+t1.x+"....."+"y:"+t1.y);
	 	
		StaticVariablesDemo4 t2=new StaticVariablesDemo4();
	
		System.out.println("x:"+t2.x+"....."+"y:"+t2.y);
	}

}
