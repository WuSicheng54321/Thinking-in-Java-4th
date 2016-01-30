import tool.P;

public class Cartoon {
	public Cartoon(){
		System.out.println("Cartoon contructor");
	}
	public static void main(){
		Cartoon x=new Cartoon();
	}
}
class Art{
	Art(){
		System.out.println("Art constructor");
	}
}
class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing constuctor");
	}
}