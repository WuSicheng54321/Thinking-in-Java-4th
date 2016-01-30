import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test16 implements Readable{
	private static Random rand=new Random(47);
	private static final char[] up="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
	private int count;
	private Test16(int count){
		this.count=count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		if(count--==0){
			return -1;
		}
		for(int i=0;i<10;i++){
			cb.append(up[rand.nextInt(up.length)]);
		}
		
//		cb.append(" ");
		return 10;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(new Test16(2));
		String a=s.nextLine();
		char c[]=a.toCharArray();
			System.out.print(Arrays.toString(c));
	}

}
