class Candy07{
	static{
		System.out.println("Loading Candy");
	}
}
class Gum{
	static{
		System.out.println("Loading Gum");
	}
}
class Cookie07{
	static{
		System.out.println("Loading Cookie");
	}
}
public class Test07{
	public static void main(String args[]){
		Class c=null;
		Object b=null;
		try {
			b=c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}