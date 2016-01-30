import java.util.LinkedList;
import java.util.ListIterator;

public class Test14 {
	static void f(LinkedList<Integer> ll,Integer[] la){
		for(Integer i:la){
			ListIterator<Integer> it=ll.listIterator(ll.size()/2);
			it.add(i);
			System.out.println(ll);
		}
	}
	public static void main(String args[]){
		LinkedList<Integer> li=new LinkedList<>();
		Integer[] x={1,2,3,4,5,6,7,8,9,0};
		Test14.f(li, x);
	}
}
