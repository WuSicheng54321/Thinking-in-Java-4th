interface Instrument{ 
	int VALUE=5;
	void adjust();
}
interface Playable{
	void play(Note n);
}
abstract class A041 implements Instrument,Playable{
	public void play(Note n) {
		System.out.println(this+",play()"+n);
	}
	public void adjust() {
		System.out.println(this+"adjust()");
	}
}
class Wind extends A041{
	public String toString(){
		return "Wind";
	}
}
class Percussion  extends A041{
	public String toString(){
		return "Percussion";
	}
}
class Stringed  extends A041{
	public String toString(){
		return "Stringed";
	}
}
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}
class Woodwind extends Wind{
	public String toString(){
		return "Woodwind";
	}
}
public class Music5 {
	static void tune(Playable i){
		i.play(Note.MEDDLE_C);
	}
	static void tuneAll(Playable[] e){
		for(Playable i:e){
			tune(i);
		}
	}
	public static void main(String args[]){
		Playable[] orchestra={
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
}
