package mutiThreading;
public class JoinDemo {

public static void main(String[] args) throws InterruptedException {

		MyThread4 t=new MyThread4();
		t.start();
	    t.join();
		for (int i = 0; i <=5; i++) {
			System.out.println("Parent");
		}
	}

}