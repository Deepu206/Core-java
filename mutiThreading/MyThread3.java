package mutiThreading;

public class MyThread3 extends Thread{

	public void run(){
		for (int i = 0; i <10; i++) {
			Thread.yield();
			System.out.println("T1-Chaild");
		}
	}
}
