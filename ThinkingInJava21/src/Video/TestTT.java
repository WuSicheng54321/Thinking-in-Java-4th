package Video;

public class TestTT implements Runnable{
	private int b=10;
	public synchronized void a() throws InterruptedException{
		b=1000;
		Thread.sleep(5000);
		System.out.println("b= "+b);
	}
	public void b(){
		b=2000;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			a();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestTT t=new TestTT();
		Thread td=new Thread(t);
		td.start();
		t.b();
		System.out.println(t.b);
	}
}
