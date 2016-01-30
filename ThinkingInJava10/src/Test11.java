interface A11In{
	
}
class A11{
	private class A11I implements A11In{
		A11I(){
			System.out.println("Inner");
		}
		public A11In f(){
			return new A11I();
		}
	}
	A11 a=new A11();
	A11.A11I b=a.new A11I();
}
public class Test11 {
	public static void main(String args[]){
		A11 a=new A11();
		
	}
}
