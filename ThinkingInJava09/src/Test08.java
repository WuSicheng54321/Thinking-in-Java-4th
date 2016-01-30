interface FastFood{
	void suger();
	void big();
}
class Sandwish implements FastFood{

	@Override
	public void suger() {
		// TODO Auto-generated method stub
		System.out.println("sandwish has suger");
	}

	@Override
	public void big() {
		// TODO Auto-generated method stub
		System.out.println("sandwish about 2 inch");
	}
	
}
public class Test08 {
	public static void main(String args[]){
		FastFood s=new Sandwish();
		s.big();
		s.suger();
	}

}
