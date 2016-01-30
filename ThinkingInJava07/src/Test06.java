
class Game{
	Game(int i){
		System.out.println("Game Constructor");
	}
}
class BroadGame extends Game{
	public BroadGame(int i) {
		// TODO Auto-generated constructor stub
		//Implicit super constructor Game() is undefined. Must explicitly invoke another constructor
		System.out.println("BroadGame constructor");
	}
}
public class Test06 extends BroadGame{
	Test06(){
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String args[]){
		Test06 c=new Test06();
	}
}