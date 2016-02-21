interface AA{
	public <T extends AA> void f(T t);
}
interface BB{
	public <T extends BB> void g(T t);
}
public class Test25 implements AA,BB{
	public <T extends AA> void f(T t){
		System.out.println(t);
	}
	public <T extends BB> void g(T t){
		System.out.println(t);
	}
	public static void main(String args[]){
		AA a=new Test25();
		BB b=new Test25();
		a.f(new Test25());
		b.g(new Test25());
		
	}
}
