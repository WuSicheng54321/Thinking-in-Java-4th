package protect;
class Test151{
	protected void test(){
		System.out.println("test in protected");
	}
}
public class Test15 extends Test151{
	public static void main(String args[]){
		Test151 t=new Test151();
		t.test();
	}
}
