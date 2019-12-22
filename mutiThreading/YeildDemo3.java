package mutiThreading;

public class YeildDemo3 {

	public static void main(String[] args) {
		
		MyThread3 t=new MyThread3();
		t.start();
		for (int i = 0; i <10; i++) {
			System.out.println("T2-Main");
		}
	}

}


