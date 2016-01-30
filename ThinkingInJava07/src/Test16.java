class Amphibian{
	void method(){
		System.out.println("method in Amphibian");
	}
	static void test(Amphibian i){
		System.out.println("test in amphibain "+i);
	}
	public String toString(){
		return "Information in Amphibain";
	}
}
class Frog extends Amphibian{
	void method1(){
		System.out.println("method in Frog");
	}
	static void test(Frog i){ 
		System.out.println("test in amphibain "+i);
	}
	public String toString(){
		return "Information in Frog";
	}
}
public class Test1617 {
	public static void main(String args[]){
		Frog f=new Frog();
		Amphibian.test(f);
		Frog.test(f);
	}
}
