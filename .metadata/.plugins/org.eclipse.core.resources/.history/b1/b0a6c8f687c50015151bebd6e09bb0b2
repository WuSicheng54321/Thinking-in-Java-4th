
public class Swich {
	private boolean state=false;
	public boolean read(){
		return state;
	}
	public void on(){
		state=true;
		System.out.println(this);
	}
	public void off(){
		state=false;
		System.out.println(this);
	}
	public String toString(){
		return state?"on":"off";
	}
	public class OnOffException1 extends Exception{}
	public class OnOffException2 extends Exception{}
	public class OnOffSwich{
		private Swich sw=new Swich();
		public void f() throws OnOffException1,OnOffException2{}
		public void main(String args[]){
			try{
				sw.on();
				f();
				sw.off();
			}catch(OnOffException1 e){
				System.out.println("OnOffException1");
				sw.off();
			}catch (OnOffException2 e) {
				System.out.println("OnOffException2");
				sw.off();
			}
		}
	}
}
