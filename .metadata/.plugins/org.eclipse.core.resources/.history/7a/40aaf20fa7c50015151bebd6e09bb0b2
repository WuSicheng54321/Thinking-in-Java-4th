class NewExecption extends Exception{
	public NewExecption(String msg){
		super(msg);
	}
}
public class Test04 {
	public static void f() throws NewExecption{
		System.out.println("throw NewExecption from f()");
		throw new NewExecption("new Execption");
	}
	public static void main(String args[]){
		try {
			f();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}

}
