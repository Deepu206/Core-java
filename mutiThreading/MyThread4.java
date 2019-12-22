package mutiThreading;

public class MyThread4 extends Thread{

	public void run(){
		
		for (int i = 0; i <=5; i++) {
			
			System.out.println("Chaild");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}