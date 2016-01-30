import java.util.ArrayList;
import java.util.Iterator;

public class Test09 {
	private static ArrayList<Object> items;
	private int next=0;
	public Test09(){
		items=new ArrayList<>();
	}
	public void add(Object x){
		items.add(x);
	}
	public static void display(Iterator<Object> it){
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}
	public static void main(String[] args){
		Test09 test09=new Test09();
		for(int i=0;i<10;i++){
			test09.add(Integer.toString(i));
		}
		display(items.iterator());
	}

}
