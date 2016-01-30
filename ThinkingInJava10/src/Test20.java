
public interface Test20 {
	void f();
	class Test implements Test20{
		public void f(){
			System.out.println("f");
		}
	}
	public static void main(String[] args){
		Test t=new Test();
		t.f();
	}
}
