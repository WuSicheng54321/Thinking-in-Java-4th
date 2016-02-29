package Video;

public class TestSync implements Runnable{
	Timer t=new Timer();
	public static void main(String[] args) {
		TestSync ts=new TestSync();
		Thread t4=new Thread(ts);
		Thread t5=new Thread(ts);
		Thread t6=new Thread(ts);
		t4.start();
		t5.start();
		t6.start();
	}
	public void run(){
		t.add(Thread.currentThread().getName());
	}
}

class Timer{
	private int num;
	public synchronized  void add(String name){
		num++;
	try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"  you are the people who "+num+" use the thread");
	}
}