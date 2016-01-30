import java.util.*;

public class Test18 {
	public static void main(String args[]){
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "one");
		map.put(3,"three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(2, "two");
		System.out.println(map);
		Iterator<Integer> it=map.keySet().iterator();
		while(it.hasNext()){
			Integer i=it.next();
			System.out.println(i.hashCode()+map.get(i));
		}
		Object[] key=map.keySet().toArray();
		for(int i=0;i<key.length;i++){
			
		}
		
	}
}
