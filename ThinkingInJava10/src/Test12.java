abstract class A12I{
	public A12I(){}
	public abstract void change(int i);
}

class A12{
	private int i=0;
	private void f(){
		System.out.println("f()");
	}
	public A12I a12i(){
		return new A12I(){
			public void change(int Ini){
				i=Ini;
				f();
			}
		};
	}
	public void newIn(){
		A12I a=a12i();
		a.change(12);
	}
}
public class Test12 {
	public static void main(String args){
		A12 a=new A12();
		a.newIn();
		A12I in=a.a12i();
		in.change(12);
	}
}
