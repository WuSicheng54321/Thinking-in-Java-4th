import java.util.logging.Logger;

public class Test18 {
	public static class A18{
		{
			System.out.println("A18");
		}
	}
	public static A18 method(){
		return new A18();
	}
	public static void main(String args[]){
		A18 a=method();
	}
}
