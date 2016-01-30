public class Detergent1{
	private String name;
	private Cleaner1 cleaner=new Cleaner1();
	public Detergent1(String name){
		this.name=name;
	}
	public void append(String a){
		name+=a;
	}
	public void dilute(){
		cleaner.append("dilute()");
	}
	public void apply(){
		cleaner.append("apply()");
	}
	public void scrub(){
		cleaner.append("scrub()");
	}
	public String toString(){
		return name;
	}
	public static void main(String args[]){
		Detergent1 test=new Detergent1("cleaner");
		test.dilute();
	}
}