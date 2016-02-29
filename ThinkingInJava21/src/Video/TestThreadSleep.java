package Video;

import java.util.Date;

public class TestThreadSleep {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Runnable2 r2=new Runnable2();
		Thread t2=new Thread(r2);
		t2.start();
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t2.stop();
	}
}
class Runnable2 implements Runnable{
	public void run(){
		while(true){
			System.out.println("===="+new Date()+"====");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
					return;
			}
		}
	}
}