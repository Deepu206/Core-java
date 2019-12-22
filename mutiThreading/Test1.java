package mutiThreading;

public class Test1 {

	public static void main(String[] args) {
		
	MyRunnableDemo1 r=new MyRunnableDemo1();
	Thread t=new Thread(r);
	t.start();
	for (int i = 0; i <=10; i++) {
		System.out.println("Parent");
	}
	

	}

}
