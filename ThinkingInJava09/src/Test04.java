abstract class A04{
	
}
class B04 extends A04{
	static void method(A04 a){
		B04 b=(B04)a;
	}
}
public class Test04 {
	public static void tune(A04 a){
		B04 b=(B04)a;
	}
	public static void main(String args[]){
		A04 a=new A04();
		new B04().method(new A04());
	}
}
