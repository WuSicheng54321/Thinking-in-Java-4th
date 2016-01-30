interface CanFight{
	void fight();
}
interface CanSwin{
	void swin();
}
interface CanFly{
	void fly();
}
interface CanClimb{
	void climb();
}
class ActionCharacter{
	public void fight(){}
}
class Hero extends ActionCharacter implements CanFight,CanSwin,CanFly,CanClimb{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void climb() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Adventure {
	public static void t(CanFight x){
		x.fight();
	}
	public static void u(CanSwin x){
		x.swin();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void y(CanClimb x){
		x.climb();
	}
	public static void main(String args[]){
		Hero h=new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		y(h);
	}
}
