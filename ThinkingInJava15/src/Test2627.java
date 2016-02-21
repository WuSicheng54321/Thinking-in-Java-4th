import java.util.*;

public class Test2627 {
	public static void main(String args[]){
/*		try{
			List<Number> list=new ArrayList<Integer>();
			Type mismatch: cannot convert from ArrayList<Integer> to List<Number>
		}catch(Exception e){
			System.out.println(e);
		}*/
		@SuppressWarnings("unused")
		List<? extends Number> list2=new ArrayList<Integer>();
	}
}
