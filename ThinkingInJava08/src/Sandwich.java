class Meal{
	Meal(){
		System.out.println("Meal()");
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettue()");
	}
}
class Pickle{
	Pickle(){
		System.out.println("Pickle()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class PortableLunch extends Lunch{
	public PortableLunch() {
		// TODO Auto-generated constructor stub
		System.out.println("PortableLunch()");
	}
}
public class Sandwich extends PortableLunch{
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	public static void main(String args[]){
		new Sandwich();
	}
	private Lettuce l=new Lettuce();
}
