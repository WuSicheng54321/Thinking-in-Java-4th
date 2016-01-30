abstract class Base{
	public abstract void print();
	Base(){
		new Stem().print();
	}
}
class Stem extends Base{
	public void print() {
		int n=9;
		System.out.println("Stem.print"+n);
	}
}
public class Test03 {
	public static void main(String args[]){
		Stem s=new Stem();
		s.print();
	}
}
