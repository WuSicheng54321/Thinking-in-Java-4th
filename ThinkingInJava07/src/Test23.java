class Test231{
	private int i=0;
	public Test231(){
		System.out.println("Test231.constructor");
	}
	public static void f(){
		System.out.println("Test231.f()");
	}
}
class Test232 extends Test231{
	private int j=0;
	public Test232(){
		System.out.println("Test232.constructor");
	}
	public static void g(){
		System.out.println("Test232.g()");
	}
}
public class Test23 {
	public static void main(String args[]){
		Test232 t232=new Test232();
		t232.f();
		t232.g();
	}
}
