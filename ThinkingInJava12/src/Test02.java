class A02{
	public void f(){}
}
public class Test02 {
	public static void main(String args[]){
		try{
			A02 a=null;
			a.f();
		}catch(Exception e){
			e.printStackTrace(System.out);
		}

	}
}
