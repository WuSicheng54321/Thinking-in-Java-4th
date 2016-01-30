package dessert;

import tool.P;

public class Cookie {
	public Cookie(){
		P.tln("Cookie consstructor");
	}
	protected void bite(){
		P.tln("bite");
	}
	public void cook(){
		P.tln("cook");
	}
}
