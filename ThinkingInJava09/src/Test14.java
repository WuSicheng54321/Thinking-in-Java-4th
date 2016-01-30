interface A141{
	void a1411();
	void a1412();
}
interface A142{
	void a1421();
	void a1422();
}
interface A143{
	void a1431();
	void a1432();
}
interface B14 extends A141,A142,A143{
	void b141();
}
class A144{
	void a1441(){
		System.out.println(getClass());
	}
}
class A145 extends A144 implements B14{

	@Override
	public void a1411() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1412() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1421() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1422() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1431() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a1432() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b141() {
		// TODO Auto-generated method stub
		
	}
}
public class Test14 {
	public static void a1451(A141 a){
		
	}
	public static void a1452(A142 a){
		
	}
	public static void a1453(A143 a){
		
	}
	public static void b14(B14 b){
		
	}
	public static void main(String args[]){
		A145 a=new A145();
		a1451(a);
		a1452(a);
		a1453(a);
		b14(a);
	}

}
