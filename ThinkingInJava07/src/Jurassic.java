class SmallBrain{}
final class Dinosuar{
	int i=7;
	int j=1;
	SmallBrain x=new SmallBrain();
	void f(){
		
	}
//	class Further extends Dinosuar{
//		
//	}The type Further cannot subclass the final class Dinosuar
}
public class Jurassic {
	public static void main(String args[]){
		Dinosuar n=new Dinosuar();
		n.f();
		n.i=40;
		n.j++;
	}

}
