class a{
	a(){
		System.out.println("this i s a constructor");
	}
}
class b extends a{
		b(){
			System.out.println("This is b constructor");
		}
}
public class Test {
		public static void main(String args[]){
			b b=new b();
		}
}