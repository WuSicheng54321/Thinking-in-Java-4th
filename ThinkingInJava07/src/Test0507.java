import tool.P;

class A extends C{
	A(int i){
		System.out.println("A constructor "+i);
	}
}
class B{
	B(int i){
		System.out.println("B constructor "+i);
	}
}
class C{
	B b=new B(11);
	C(){
		System.out.println("C constructor");
	}
}
public class Test0507 {
	public static void main(String args[]){
		C c=new C();//调用C构造器，C中创建B的对象
	}
}
