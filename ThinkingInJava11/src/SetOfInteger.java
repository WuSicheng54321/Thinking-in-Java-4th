import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
	public static void main(String args[]){
		Random rand=new Random();
		Set<Integer> intset=new HashSet<Integer>();
		LinkedList<Integer> intlist=new LinkedList<>();
		for(int i=0;i<10000;i++){
			intset.add(rand.nextInt(30));
		}
		for(int i=0;i<10000;i++){
			intlist.add(rand.nextInt(30));
		}
		System.out.println(intset);
		System.out.println(intlist);
	}
}
