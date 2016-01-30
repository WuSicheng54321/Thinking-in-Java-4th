interface U{
	void a();
	void b();
	void c();
}
class A{
	public U u(){
		return new U(){
			public void a(){}
			public void b(){}
			public void c(){}
		};
	}
}
class B{
	U[] u;
	public void ba(U u2){
		for(int i=0;i<u.length;i++){
			u[i]=u2;
		}
	}
	public void bb(){
		for(U u3:u){
			u3=null;
		}
	}
	public void bc(){
		for(U u4:u){
			u4.a();
			u4.b();
			u4.c();
			System.out.println(u4);
		}
	}
}
public class Test23 {
	public static void main(String args[]){
		A[] a;
		B[] b;
		b=a.u();
	}
}
