import java.util.ArrayList;
import java.util.Iterator;

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
class Gerbil2 extends Rodent{
	Gerbil2(){
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
	public Hamster(String string) {
		// TODO Auto-generated constructor stub
	}
	public void mothed(){
		System.out.println("Hamster.method()");
	}
	public String toString(){
		return "Hamster";
	}
}
public class Test10 {
	public static void change(Rodent r){
		r.mothed();
		System.out.println(r.toString());
	}
	public static void changeAll(Rodent[] r){
		for(Rodent i:r){
			change(i);
		}
	}
	public static void display(Iterator<Rodent> it){
		while(it.hasNext()){
			Rodent r=it.next();
			System.out.println(r);
		}
	}
	public static void main(String args[]){
		ArrayList<Rodent> rd=new ArrayList<>();
		rd.add(new Mouse());
		rd.add(new Gerbil2());
		rd.add(new Hamster());
		display(rd.iterator());
	}
}
