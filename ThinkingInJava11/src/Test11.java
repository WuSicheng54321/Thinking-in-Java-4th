import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test11 {
	public static void display(Iterator<Object> it){
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
	public static void main(String args[]){
		Collection<Object> list=new ArrayList<>();
		list.add(1);
		list.add("2");
		list.add(3.0f);
		list.add(new Integer(4));
		display(list.iterator());	
	}
}
