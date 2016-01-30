package music;
enum Node{
	MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
	public void play(Node n){
		System.out.println("Instrument.play()");
	}
	public String toString(){
		return "Instrument";
	}
	public void adjust(){
		System.out.println("Instrument.adjust()");
	}
}
class Wind extends Instrument{
	public void play(Node n){
		System.out.println("Wind.play()"+n);
	}
	public String toString(){
		return "Wind";
	}
	public void adjust(){
		System.out.println("Wind.adjust()");
	}
}
class Percussion extends Instrument{
	public void play(Node n){
		System.out.println("Percussion.play()"+n);
	}
	public String toString(){
		return "Percussion";
	}
	public void adjust(){
		System.out.println("Percussion.adjust()");
	}
}
class Stringed extends Instrument{
	public void play(Node n){
		System.out.println("Stringed.play()"+n);
	}
	public String toString(){
		return "Stringed";
	}
	public void adjust(){
		System.out.println("Stringed.adjust()");
	}
}
class Violin extends Instrument{
	public void play(Node n){
		System.out.println("Violin.play()"+n);
	}
	public String toString(){
		return "Violin";
	}
	public void adjust(){
		System.out.println("Violin.adjust()");
	}
}
class Woodwind extends Wind{
	public void play(Node n){
		System.out.println("Woodwind.play()"+n);
	}
	public String toString(){
		return "Woodwind";
	}
}
class Brass extends Wind{
	public void play(Node n){
		System.out.println("Brass.play()"+n);
	}
	public String toString(){
		return "Brass";
	}
}
public class Music {
	public static void tune(Instrument i){
		i.play(Node.C_SHARP);
	}
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			tune(i);
		}
	}
	public static void main(String args[]){
		Instrument[] orchestra={
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind(),
				new Violin()
		};
		tuneAll(orchestra);
		System.out.println(new Instrument());
//		Wind flute=new Wind();
//		Brass brass=new Brass();
		
//		Stringed stringed=new Stringed();
//		tune(flute);
//		tune(brass);
//		tune(stringed);
//		
	}
}