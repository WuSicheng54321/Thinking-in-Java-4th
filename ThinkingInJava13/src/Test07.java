import java.util.Arrays;

public class Test07 {
	static String s1=Spiltting.knights;
	public static void method(String s){
			System.out.println(s.matches("[A-Z].*.$"));
	}
	public static void split(String args){
		System.out.println(Arrays.toString(s1.split("the\\W+")));
	}
	public static void main(String args[]){
		System.out.println(s1.replaceAll("[aeiou]", "_"));
		System.out.println(System.nanoTime());
		method("Ac fdasfa");
		split(s1);
	}
}
