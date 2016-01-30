class A{
	public void method1(){
		method2();
		System.out.println("A.method1()");
	}
	public void method2(){
		System.out.println("A.method2()");
	}
}
class A2 extends A{
	public void method2(){
		System.out.println("A2.method2()");
	}
}
public class Test10 {
	public static void main(String args[]){
		A2 a2=new A2();
		a2.method1();
	}
}
