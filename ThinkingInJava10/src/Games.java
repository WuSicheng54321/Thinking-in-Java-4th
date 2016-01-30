interface Game{
	boolean move();
}
interface GameFactory{
	Game getGame();
}
class Checkers implements Game{
	private Checkers(){}
	private int moves=0;
	private static final int MOVES=3;
	public boolean move(){
		System.out.println("Checkers move"+moves);
		return ++moves!=MOVES;
	}
	public static GameFactory factory=new GameFactory() {
		
		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Checkers();
		}
	};
}
class Chess implements Game{
	private Chess(){}
	private int moves=0;
	private static final int MOVES=4;
	public boolean move(){
		System.out.println("Chess move"+moves);
		return ++moves!=MOVES;
	}
	public static GameFactory factory=new GameFactory() {
		
		@Override
		public Game getGame() {
			// TODO Auto-generated method stub
			return new Chess();
		}
	};
}
public class Games{
	public static void playGame(GameFactory fact){
		Game g=fact.getGame();
		while(g.move());
	}
	public static void main(String args[]){
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}
