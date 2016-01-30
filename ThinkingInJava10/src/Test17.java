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
	public static BetFactory betFactory=new BetFactory() {
		public Bet getBet() {
			return new Coin();
		}
	};
}
class Dice implements Bet{
	public void inf(){
		System.out.println("throw the dice");
	}
	public static BetFactory betFactory=new BetFactory() {
		public Bet getBet() {
			return new Dice();
		}
	};
}
public class Test17 {
	public static void makeBet(BetFactory bf){
		Bet b=bf.getBet();
		b.inf();
	}
	public static void main(String args[]){
		makeBet(Dice.betFactory);
		makeBet(Coin.betFactory);
	}
}
