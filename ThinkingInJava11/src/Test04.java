import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

public class Test04 {
	public static Collection<String> next(Collection<String> collection){
		collection.add("Snow White");
		collection.add("Star Wars");
		collection.add("Big Band");
		return collection;
	}
	public static String[] next(String[] s){
		s[0]="Snow";
		s[1]="Star Wars";
		s[2]="Big Band";
		return s;
	}
	public static Map next(Map<String,String> map){
		map.put("a","Snow White");
		map.put("b","Star Wars");
		map.put("c", "Big Band");
		return map;
	}
	public static void main(String args[]){
		System.out.println(next(new ArrayList<String>()));
		System.out.println(next(new LinkedList<String>()));
		System.out.println(next(new HashSet<String>()));
		System.out.println(next(new LinkedHashSet<String>()));
		System.out.println(next(new TreeSet<String>()));
	}
}
