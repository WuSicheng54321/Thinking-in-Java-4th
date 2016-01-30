import java.util.ArrayList;
import java.util.List;

class A07{
	public String toString(){
		return "A07";
	}
}
public class Test07 {
	public static void main(String args[]){
		List<A07> list=new ArrayList<>();
		list.add(new A07());
		list.add(new A07());
		list.add(new A07());
		list.add(new A07());
		list.add(new A07());
		System.out.println("list: "+list);
		List<A07> list2=list.subList(0, 2);
		System.out.println("subList "+list2);
	}
}
