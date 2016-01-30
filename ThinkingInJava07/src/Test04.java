import tool.P;

class grandfather{
	public grandfather() {
		// TODO Auto-generated constructor stub
		P.tln("this is grandfater");
	}
}
class father extends grandfather{
	public father() {
		// TODO Auto-generated constructor stub
		P.tln("this is father");
	}
}
public class Test04 extends father{
	public Test04() {
		// TODO Auto-generated constructor stub
		P.tln("this is son");
	}
	public static void main(String args[]){
		Test04 x=new Test04();
	}
}
