import tool.P;

public class Cleaner1 {
	private String s="Cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
	public static void main(String[] args){
		Cleaner x=new Cleaner();
		x.dilute();
		x.apply();
		x.scrub();
		P.tln(x);
	}
}
