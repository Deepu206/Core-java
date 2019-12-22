package mutiThreading;

public class MyRunnableDemo1 implements Runnable{

	public void run(){
		
		for (int i = 0; i <=10; i++) {
			System.out.println("Chaild");
		}
	}
}
