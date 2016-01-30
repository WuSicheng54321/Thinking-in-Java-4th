import tool.P;
class ASS{
	private int a=1;
	public int b=2;
	protected int c=3;
	int d=4;
	
	private void aa(){
		P.tln("this is private a");
	}
	public void bb(){
		P.tln("this is public b");
	}
	protected void cc(){
		P.tln("this is protected c");
	}
	void dd(){
		P.tln("this is default d");
	}
}

public class Test05 {
	public static void main(String args[]){
		ASS t5=new ASS();
		//t5.a=2;
		t5.b=2;
		t5.c=2;
		t5.d=2;
		//t5.aa();
		t5.bb();
		t5.cc();
		t5.dd();
	}
}
