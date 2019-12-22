package mutiThreading;

public class InteruptedThreadDemo5 {

	public static void main(String[] args) {
			
    MyThread5 t=new MyThread5();
    t.start();
    t.interrupt();
    System.out.println("End of main");
	}

}
