abstract class A{
	final static double PI=3.14;
	public void f(){
		System.out.println("f()"+PI);
	}
	static void g(){
		
	}
}
public class Test02 {
	public static void main(String args[]){
		//Cannot instantiate the type A
		A a=new A();
	}
}
