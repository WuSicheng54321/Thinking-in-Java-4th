package Video;

public class TestThread {
	public static void main(String[] args) {
		Runnable1 r1=new Runnable1();
		Thread thread=new Thread(r1);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		
		for(int i=0;i<1000;i++){
			System.out.println("Main"+i);
		}
		
	}
}

class Runnable1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("----------------------Runnable----"+i);
		}
	}
}