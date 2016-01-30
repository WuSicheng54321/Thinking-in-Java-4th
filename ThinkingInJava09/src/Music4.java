////abstract class Instrument{
//	private int i;
//	public abstract void play(Note n);
//	public String what(){
//		return "Instrument";
//	}
//	public abstract void adjust();
//}
//class Wind extends Instrument{
//	public void play(Note n) {
//		System.out.println("wind.play()"+n);
//	}
//	public void adjust() {}
//	public String what(){
//		return "Wind";
//	}	
//}
//class Percussion extends Instrument{
//	public void play(Note n) {
//		System.out.println("percussion.play()"+n);
//	}
//	public void adjust() {}
//	public String what(){
//		return "Percussion";
//	}
//}
//class Stringed extends Instrument{
//	public void play(Note n) {
//		System.out.println("stringed.play()"+n);
//	}
//	public void adjust() {}
//	public String what(){
//		return "Stringed";
//	}
//}
//class Brass extends Wind{
//	public void play(Note n){
//		System.out.println("brass.play()"+n);
//	}
//	public void adjust(){
//		System.out.println("brass.adjust()");
//	}
//}
//class Woodwind extends Wind{
//	public void play(Note n){
//		System.out.println("woodwind.play()"+n);
//	}
//	public String what(){
//		return "woodwind";
//	}
//}
//public class Music4 {
//	static void tune(Instrument i){
//		i.play(Note.MIDDLE_C);
//	}
//	static void tuneAll(Instrument[] e){
//		for(Instrument i:e){
//			tune(i);
//		}
//	}
//	public static void main(String args[]){
//		Instrument[] orchestra={
//				new Wind(),
//				new Percussion(),
//				new Stringed(),
//				new Brass(),
//				new Woodwind()
//		};
//		tuneAll(orchestra);
//	}
//
//}
