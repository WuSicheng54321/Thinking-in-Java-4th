import filter.Waveform;

//import java.util.Arrays;
//
interface Process{
	public String name();
	Waveform process(Object input);
}
//class Upcase implements Process{
//	public String process(Object input){
//		return ((String)input).toUpperCase();
//	}
//	public String name(){
//		return getClass().getSimpleName();
//	}
//}
//class Downcase implements Process{
//	public String process(Object input){
//		return ((String)input).toLowerCase();
//	}
//	public String name(){
//		return getClass().getSimpleName();
//	}
//}
//class Splitter implements Process{
//	public String process(Object input){
//		return Arrays.toString(((String)input).split(" "));
//	}
//	public String name(){
//		return getClass().getSimpleName();
//	}
//}
public class Apply {
	public static void process(Process p,Object s){
		System.out.println("Using Process "+p.name());
		System.out.println(p.process(s));
	}
	public static String s="Disagreement with beliefs is by definition incorrect";
	public static void main(String args[]){
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new Splitter(),s);
	}
}
