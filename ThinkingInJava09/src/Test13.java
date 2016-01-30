interface A13{
	void a13();
}
interface B131 extends A13{
	void b131();
}
interface B132 extends A13{
	void b132();
}
interface C13 extends B131,B132{
	void c13();
}
class D13 implements A13,B131,B132,C13{

	@Override
	public void c13() {
		// TODO Auto-generated method stub
		System.out.println(getClass());
	}

	@Override
	public void b132() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
	}

	@Override
	public void b131() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
	}

	@Override
	public void a13() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName());
	}
	
}
public class Test13 {
	public static void main(String args[]){
		D13 d13=new D13();
		d13.a13();
		d13.b131();
		d13.b132();
		d13.c13();
	}
}
