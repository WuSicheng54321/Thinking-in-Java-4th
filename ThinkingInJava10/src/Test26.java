class A26{
	class A26In{
		public A26In(int i){
			System.out.println(i);
		}
	}
}
public class Test26 {
	public class Test26In extends A26.A26In{
		public Test26In(A26 a26, int i) {
			a26.super(i);
		}
	}
	public static void main(String args[]){
		Test26 t=new Test26();
		Test26.Test26In i=t.new Test26In(new A26(),1);
	}
}
