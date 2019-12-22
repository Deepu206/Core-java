package mutiThreading;

public class OverLoadingOfRun_5 extends Thread{

	public void run(){
		System.out.println("no-agr run()");
	}
	
	public void run(String s){
		System.out.println("String -arg run()");
	}
	
}

