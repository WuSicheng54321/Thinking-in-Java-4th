class Startship{
	public void act(){
		
	}
}
class StartShip1 extends Startship{
	public void act(){
		System.out.println("StartShip1");
	}
}
class StartShip2 extends Startship{
	public void act(){
		System.out.println("StartShip2");
	}
}
class StartShip3 extends Startship{
	public void act(){
		System.out.println("StartShip3");
	}
}
class  Change{
	private Startship ss=new StartShip1();
	public void changeTo2(){
		ss=new StartShip2();
	}
	public void changeTo3(){
		ss=new StartShip3();
	}
	public void perform(){
		ss.act();
	}
}
public class Test16 {
	public static void main(String args[]){
		Change change=new Change();
		change.perform();
		change.changeTo2();
		change.perform();
		change.changeTo3();
		change.perform();
	}

}
