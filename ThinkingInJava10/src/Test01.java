class Outer{
	class Inner{
		
	}
	public Inner in(){
		return new Inner();
	}
}
public class Test01 {
	public static void main(String args[]){
		Outer.Inner i=new Outer().in();
		System.out.println(i.toString());
	}
}
