interface A13In{
	void f();
}
public class Test13 {
	public A13In method(){
		return new A13In(){
			public void f() {
				
			}
		};
	}
}
