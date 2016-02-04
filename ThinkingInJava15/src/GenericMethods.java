
public class GenericMethods {
	public <T,D,C> void f(Integer x,D d,C c){
		System.out.println(x+" "+d+" "+c);
	}
	public static void main(String args[]){
		GenericMethods gm=new GenericMethods();
		gm.f(1," "," ");
		gm.f(1,1,1);
		gm.f(1,1.0,1.0);
		gm.f(1,1.0F,1.0F);
		gm.f(1,'D','F');
		gm.f(1,gm,gm);
	}
}
