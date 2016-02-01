
public class Test10 {
	public static void method(char[] c){
		Class cc=c.getClass();
		if(cc.equals(Object.class)){
			System.out.println("this is a object");
		}else{
			System.out.println("this is not a object");
		}
	}
	public static void main(String args[]){
		char[] c={'a','b','c'};
		method(c);
	}
}
