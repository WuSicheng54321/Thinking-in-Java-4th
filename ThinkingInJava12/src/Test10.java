class A10Exception1 extends Exception{
	
}
class A10Exception2 extends Exception{
	
}
class A10{
	public static void f() throws A10Exception2{
		try{
			g();
		}catch(A10Exception1 e){
			e.printStackTrace();
			throw new A10Exception2();
		}
	}
	public static void g() throws A10Exception1{
		throw new A10Exception1();
	}
}
public class Test10 {
	public static void main(String args[]) throws A10Exception2,A10Exception1{
		A10.f();
		A10.g();
	}
	
}
