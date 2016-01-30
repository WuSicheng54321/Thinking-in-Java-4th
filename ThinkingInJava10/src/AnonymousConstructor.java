abstract class Base{
	public Base(int i){
		System.out.println("base constructor,i="+i);
	}
	public abstract void f();
}
public class AnonymousConstructor {
	public static Base getBase(int i){
		return new Base(i) {
			{
				System.out.println("Inside instance initializer");
			}
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous f()");
			}
		};
	}
	public static void main(String args[]){
		Base base=getBase(17);
		base.f();
	}

}
