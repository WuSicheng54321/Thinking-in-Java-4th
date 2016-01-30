import dessert.Cookie;

public class Test04 {
	public static void main(String args[]){
		Cookie c=new Cookie();
		c.cook();
		// protected 有包访问权但是不是public c.bite();
	}
}
