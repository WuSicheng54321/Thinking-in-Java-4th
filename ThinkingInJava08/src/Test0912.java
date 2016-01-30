class Rodent{
	Rodent(){
		System.out.println("Rodent()");
	}
	public void mothed(){
		System.out.println("Rodent.method()");
	}
	public String toString(){
		return "Rodent";
	}
}
class Mouse extends Rodent{
	Mouse(){
		System.out.println("Mouse()");
	}
	public void mothed(){
		System.out.println("Mouse.method()");
	}
	public String toString(){
		return "Mouse";
	}
}
class Gerbil extends Rodent{
	Gerbil(){
		System.out.println("Gerbil()");
	}
	public void mothed(){
		System.out.println("Gerbil.method()");
	}
	public String toString(){
		return "Gerbil";
	}
}
class Hamster extends Rodent{
	Hamster(){
		System.out.println("Hamster()");
	}
	public void mothed(){
		System.out.println("Hamster.method()");
	}
	public String toString(){
		return "Hamster";
	}
}
public class Test0912 {
	public static void change(Rodent r){
		r.mothed();
		System.out.println(r.toString());
	}
	public static void changeAll(Rodent[] r){
		for(Rodent i:r){
			change(i);
		}
	}
	public static void main(String args[]){
//		Rodent[] r={
//				new Rodent(),
//				new Mouse(),
//				new Gerbil(),
//				new Hamster()
//		};
//		changeAll(r);
		new Mouse();
		new Gerbil();
		new Hamster();
	}
}
