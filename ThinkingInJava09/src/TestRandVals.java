import java.util.Random;

interface RandVals{
	Random RAND=new Random(47);
	int RAND_INT=RAND.nextInt(10);
	long RANDOM_LONG=RAND.nextLong()*10;
	
}
public class TestRandVals {
	public static void main(String args[]){
		System.out.println(RandVals.RAND_INT);
	}
}
