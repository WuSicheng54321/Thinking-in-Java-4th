interface Rodent07{
	public void mothed();
	public String toString();
}
class Mouse07 implements Rodent07{
	Mouse07(){
		System.out.println("Mouse07()");
	}
	public void mothed(){
		System.out.println("Mouse07.method()");
	}
	public String toString(){
		return "Mouse07";
	}
}
class Gerbil07 implements Rodent07{
	Gerbil07(){
		System.out.println("Gerbil()");
	}
	public void mothed(){
		System.out.println("Gerbil.method()");
	}
	public String toString(){
		return "Gerbil";
	}
}
class Hamster07 implements Rodent07{
	Hamster07(){
		System.out.println("Hamster()");
	}
	public void mothed(){
		System.out.println("Hamster.method()");
	}
	public String toString(){
		return "Hamster";
	}
}
public class Test07 {
	public static void change(Rodent07 r){
		r.mothed();
		System.out.println(r.toString());
	}
	public static void changeAll(Rodent07[] r){
		for(Rodent07 i:r){
			change(i);
		}
	}
	public static void main(String args[]){
//		Rodent[] r={
//				new Rodent(),
//				new Mouse07(),
//				new Gerbil(),
//				new Hamster()
//		};
//		changeAll(r);
		new Mouse07();
		new Gerbil07();
		new Hamster07();
	}
}
