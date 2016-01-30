class Useful{
	public void f(){}
	public void g(){}
}
class MoreUseful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
	public void w(){}
}
public class RTTI {
	public static void main(String args[]){
		Useful[] x={
				new Useful(),
				new MoreUseful(),
		};
		x[0].f();
		x[1].f();
		MoreUseful xx=new Useful();
	}
}
