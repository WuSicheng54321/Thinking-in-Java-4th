class WithFinals{
	private final void f(){
		System.out.println("WithFinals.f()");
	}
	private void g(){
		System.out.println("WithFinals.g()");
	}
}
class OveriddingPrivate extends WithFinals{
	private final void f(){
		System.out.println("OveriddingPrivate.f()");
	}
	private void g(){
		System.out.println("OveriddingPrivate.g()");
	}
}
class OveriddingPrivate2 extends WithFinals{
	public final void f(){
		System.out.println("OveriddingPrivate2.f()");
	}
	public void g(){
		System.out.println("OveriddingPrivate2.g()");
	}
}
public class FinalOverridingIllusion {
	public static void main(String args[]){
		OveriddingPrivate2 op2=new OveriddingPrivate2();
		op2.f();
		op2.g();
		@Override
		OveriddingPrivate op=op2;
//		op.f();
//		op.g();
		WithFinals wf=op2;
//		wf.f();
//		wf.g();
	}
}
