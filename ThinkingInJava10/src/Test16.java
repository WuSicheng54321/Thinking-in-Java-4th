interface Cycle{
	void ride();
}
interface CycleFactory{
	Cycle getCycle();
}
class Unicycle implements Cycle{
	public void ride(){
		System.out.println("Unicycle ride");
	}
	public static CycleFactory getCycle=new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}
class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Bicycle ride");
	}
	public static CycleFactory getCycle=new CycleFactory(){
		public Cycle getCycle(){
			return new Bicycle();
		}
	};
}
class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Tricycle ride");
	}
	public static CycleFactory getCycle=new CycleFactory(){
		public Cycle getCycle(){
			return new Tricycle();
		}
	};
}
public class Test16 {
	public static void rideCycle(CycleFactory ft){
		Cycle c=ft.getCycle();
		c.ride();
	}
	public static void main(String args[]){
		rideCycle(Bicycle.getCycle);
		rideCycle(Unicycle.getCycle);
		rideCycle(Tricycle.getCycle);
	}
}