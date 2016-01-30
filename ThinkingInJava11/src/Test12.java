import java.util.*;

public class Test12 {
	public static void main(String args[]){
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		ListIterator<Integer> it=list1.listIterator(list1.size());
		while(it.hasPrevious()){
			list2.add(it.previous());
		}
		System.out.println(list2);
		for(int i=list1.size()-1;i>=0;i--){
			list2.add(list1.get(i));
		}
		System.out.println(list2);
		
	}
}
