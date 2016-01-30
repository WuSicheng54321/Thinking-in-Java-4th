interface A10{
	void f();
	A10 h();
}
public class Test10 {
	public static A10 g(){
		boolean b=true;
		if(b){
			class A10I implements A10{
				public void f() {}
				public A10 h(){
					return new A10I();
				}
			}
		}
		return new Test10().g().h();
	}
}
