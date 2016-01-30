interface Bet{
	void inf();
}
interface BetFactory{
	Bet getBet();
}
class Coin implements Bet{
	public void inf(){
		System.out.println("throw the coin");
	}
}
class CoinFactory implements BetFactory{
	public Bet getBet(){
		return new Coin();
	}
}
class Dice implements Bet{
	public void inf(){
		System.out.println("throw the dice");
	}
}
class DiceFactory implements BetFactory{
	public Bet getBet(){
		return new Dice();
	}
}
public class Test19 {
	public static void makeBet(BetFactory bf){
		Bet b=bf.getBet();
		b.inf();
	}
	public static void main(String args[]){
		makeBet(new CoinFactory());
		makeBet(new DiceFactory());
	}
}
