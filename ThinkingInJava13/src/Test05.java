import java.util.Formatter;

public class Test05 {
	public static void main(String args[]){
		int i = 8;
		long l;
		double d;
		String s;
		boolean b;
		char c;
		Formatter f=new Formatter(System.out);
		f.format("%d %c %b %s %x %h\n", i,i,i,i,i,i);
	}
}
