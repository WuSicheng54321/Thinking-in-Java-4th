class A08O{
	class A08I{
		private int i=12;
	}
	public void f(){
		System.out.println(new A08O().new A08I().i);
	}
}
public class Test08 {
	public static void main(String args[]){
		A08O a=new A08O();
		a.f();
	}

}
