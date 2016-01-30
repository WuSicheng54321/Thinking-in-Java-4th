class OneException extends Exception{
	public OneException(String s){
		super(s);
	}
}
class twoException extends Exception{
	public twoException(String s){
		super(s);
	}
}
public class RethowNew {
	public static void f() throws OneException{
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}
	public static void main(String args[]){
		try{
			try{
				f();
			}catch(OneException e){
				System.out.println("Caught in inner try,e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new twoException("from inner try");
			}
		}catch(twoException e){
			System.out.println("Caught in outer try,e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
