import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Randomwords implements Readable {
	private static Random rand=new Random(47);
	private static final char[] capitals="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers="abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels="aeiou".toCharArray();
	private int count;
	public Randomwords(int count) {
		// TODO Auto-generated constructor stub
		this.count=count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count--==0){
			return -1;
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for(int i=0;i<4;i++){
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(new Randomwords(10));
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}

}
