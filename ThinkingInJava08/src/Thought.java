class A3 extends Thought{
	public void a(){
		System.out.println("public a()");
	}
}
public class Thought {
	private void a(){
		System.out.println("private a()");
	}
	public static void main(String args[]){
		A3 a2=new A3();
		a2.a();
	}
}
