package mutiThreading;

public class ThreadPriority_1 {

	public static void main(String[] args) {
		MyThread2 t=new MyThread2();
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		t.start();
		for (int i = 0; i <=10; i++) {
			System.out.println("Main");
			
		}
	}

}
