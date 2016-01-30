class A09Exception1 extends Exception{
	
}
class A09Exception2 extends Exception{
	
}
class A09Exception3 extends Exception{
	
}
public class Test09 {
	public static void f(int i) throws A09Exception1,A09Exception2,A09Exception3{
		if(i==1){
			throw new A09Exception1();
		}else if(i==2){
			throw new A09Exception2();
		}else if(i==3){
			throw new A09Exception3();
		}
	}
	public static void main(String args[]){
		try {
			f(1);
			f(2);
			f(3);
		} catch (A09Exception1 | A09Exception2 | A09Exception3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
