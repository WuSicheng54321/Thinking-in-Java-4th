class Test191{
	private int i;
	Test191(int ii){
		i=ii;
	}
	public String toString(){
		return "Test191";
	}
}
public class Test19 {
	private final int i=0;
	private final int j;
	private final Test191 p;
	public Test19(){
		j=1;
		p=new Test191(1);
		System.out.println("Test19blank"+p+","+j);
	}
	public Test19(int x){
		j=x;
		p=new Test191(x);
		System.out.println("Test19intx"+p+","+j);
	}
	public static void main(String args[]){
		new Test19();
		new Test19(47);
	}
}