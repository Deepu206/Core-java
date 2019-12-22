package mutiThreading;

public class SetAndGetDemo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
    MyThread t=new MyThread();
    System.out.println(t.getName());//main
    
   Thread.currentThread().setName("Divya");//Thread-0
   System.out.println(Thread.currentThread().getName()); //Divya
   
	}
}
