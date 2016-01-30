import java.util.*;

public class Test17 {
	public static void main(String args[]){
		Map<String, Gerbil> test17=new HashMap<>();
		test17.put("Fuzzy", new Gerbil(1));
		test17.put("Spot",new Gerbil(2));
		test17.put("Jack", new Gerbil(3));
		Iterator<String> it=test17.keySet().iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.print(s+" "+test17.get(s)+" ");
			test17.get(s).hop();
			System.out.println();
		}
		
	}
}
