package mutiThreading;

public class MyThread5 extends Thread{

	public void run(){
			
			try {
				for (int i = 0; i <=10; i++) 
				{
				System.out.println("I am LAZY thread");
				Thread.sleep(1000);
			    }
		    	}catch (InterruptedException e) 
			    {
				System.out.println("I got interrupted....");
			    }
			}
	}
