class A07{
	private int i=0;
	private void f(){
		System.out.println("f()");
	}
	class A07I{
		public void change(int Ini){
			i=Ini;
			f();
		}
	}
	public void newIn(){
		A07I a=new A07I();
		a.change(12);
	}
}
public class Test07 {
	public static void main(String args){
		A07 a=new A07();
		a.newIn();
		A07.A07I in=a.new A07I();
		in.change(12);
	}
}
