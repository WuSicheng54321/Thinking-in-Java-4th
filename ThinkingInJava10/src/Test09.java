interface A09{
	void f();
}
public class Test09 {
	public static A09 g(){
		class A09I implements A09{
			public void f() {}
		}
		return new A09I();
	}
}
