class Root{
	Root(String s){
		System.out.println("Root constructor "+s);
	}
	void despose(){
		System.out.println("Root despose");
	}
	Component1 c1=new Component1(1);
	Component2 c2=new Component2(2);
	Component3 c3=new Component3(3);
}
class Component1{
	Component1(int i){
		System.out.println("Component1 constructor "+i);
	}
	void despose(){
		System.out.println("Component1 despose");
	}
}
class Component2{
	Component2(int i){
		System.out.println("Component2 constructor "+i);
	}
	void despose(){
		System.out.println("Component2 despose");
	}
}
class Component3{
	Component3(int i){
		System.out.println("Component3 constructor "+i);
	}
	void despose(){
		System.out.println("Component3 despose");
	}
}
class Stem extends Root{
	Stem(String s){
		super(s);
		System.out.println("Stem constructor "+s);
	}
	Component1 c1=new Component1(4);
	Component2 c2=new Component2(5);
	Component3 c3=new Component3(6);
	void despose(){
		System.out.println("Stem despose");
		super.despose();
	}
}
public class Test0910 {
	public static void main(String args[]){
		Root r;
		Stem st;
		Component1 c1;
		Component2 c2;
		Component3 c3;
		r=new Root("Root");
		st=new Stem("Stem");
		c1=new Component1(1);
		c2=new Component2(2);
		c3=new Component3(3);
		r.despose();
		st.despose();
		c1.despose();
		c2.despose();
		c3.despose();
	}
}
