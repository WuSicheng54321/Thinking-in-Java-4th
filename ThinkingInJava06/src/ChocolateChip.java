import dessert.Cookie;
import tool.P;

public class ChocolateChip extends Cookie {
	public ChocolateChip(){
		P.tln("ChocolateChip constructor");
	}
	public void chomp(){
		bite();
	}
	public static void main(String args[]){
		ChocolateChip cho=new ChocolateChip();
		cho.chomp();
	}
}
