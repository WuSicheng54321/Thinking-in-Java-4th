import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String args[]){
		Class a=new ArrayList<String>().getClass();
		Class b=new ArrayList<Integer>().getClass();
		System.out.println(a==b);
	}
}
