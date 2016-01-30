class Base1{
	int method(int i){
		System.out.println("Base int method");
		return i;
	}
	String method(String s){
		System.out.println("Base String method");
		return s;
	}
	float method(float f){
		System.out.println("Base float method");
		return f;
	}
}
class AS{
	
}
class Stem1 extends Base1{
	void method(){
		System.out.println("Stem void menthod");
	}
}
public class Test13 {
	public static void main(String args[]){
		Stem1 s1=new Stem1();
		s1.method(1);
		s1.method(1.0f);
		s1.method("s");
		s1.method();
	}
}
