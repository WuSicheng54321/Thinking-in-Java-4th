class Test211{
	private final void test(){
		System.out.println("Test211.test()");
	}
}
public class Test21 extends Test211{
	public void test(){
		System.out.println("Test21.test()");
	}
	public static void main(String args[]){
		Test21 t21=new Test21();
		t21.test();
	}
}
