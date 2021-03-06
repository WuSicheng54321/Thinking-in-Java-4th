interface Incrementable{
	void increment();
}
class Callee1 implements Incrementable{
	private int i=0;
	public void increment(){
		i++;
		System.out.println(i);
	}
}
class MyIncrement{
	public void increment(){
		System.out.println("Other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}
class Calle2 extends MyIncrement{
	private int i=0;
	public void increment(){
		super.increment();
		i++;
		System.out.println(i);
	}
	private class Closure implements Incrementable{
		public void increment(){
			Calle2.this.increment();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}
class Caller{
	private Incrementable callbackReference;
	public Caller(Incrementable cbh) {
		// TODO Auto-generated constructor stub
		callbackReference=cbh;
	}
	void go(){
		callbackReference.increment();
	}
}
public class Callback {
	public static void main(String args[]){
		Callee1 c1=new Callee1();
		Calle2 c2=new Calle2();
		MyIncrement.f(c2);
		Caller caller1=new Caller(c1);
		Caller caller2=new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}
