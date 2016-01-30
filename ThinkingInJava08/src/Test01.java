class Cycle{
	private int i=0;
	public void inf(){
		System.out.println("Cycle.ride()");
	}
	public int wheels(int i){
		this.i=i;
		return i;
	}
}
class Unicycle extends Cycle{
	public void inf(){
		System.out.println("Unicycle.ride()");
	}
	public void balance(){
		System.out.println("Unicycle.balance");
	}
}
class Bicycle extends Cycle{
	public void inf(){
		System.out.println("Bicycle.ride()");
	}
	public void balance(){
		System.out.println("Bicycle.balance");
	}
}
class Tricycle extends Cycle{
	public void inf(){
		System.out.println("Tricycle.ride()");
	}
}
public class Test01 {
	public static void ride(Cycle c,int i){
		c.inf();
		System.out.println(c.wheels(i));
	}
	public static void main(String args[]){
		Cycle u=new Unicycle();
		Cycle b=new Bicycle();
		Cycle t=new Tricycle();
		ride(u,2);
		ride(b,3);
		ride(t,4);
		Unicycle s=(Unicycle)u;
		s.balance();
		u.balance();
	}

}
