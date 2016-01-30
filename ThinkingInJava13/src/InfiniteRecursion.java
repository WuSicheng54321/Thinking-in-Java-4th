import java.util.*;

public class InfiniteRecursion {
	public String toString(){
		return "InfiniteRecusion address"+super.toString()+"\nj";
	}
	public static void main(String args[]){
		List<InfiniteRecursion> v=new ArrayList<>();
		 v.add(new InfiniteRecursion());
		 System.out.println(v);
	}
}
