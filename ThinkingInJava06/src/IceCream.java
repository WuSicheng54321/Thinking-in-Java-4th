class Sundae{
	private Sundae(){
		
	}
	static Sundae makeASundae(){
		return new Sundae();
	}
}
public class IceCream {
	Sundae sundae2=Sundae.makeASundae();

}
