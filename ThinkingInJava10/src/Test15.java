class A15{
	public A15(int i){}
}
public class Test15{
	private int i;
	public A15 method(){
		return new A15(i);
	}
	A15 a=new A15(i){
		public A15 f(){
		  return new Test15().method();
		}
	};
}
