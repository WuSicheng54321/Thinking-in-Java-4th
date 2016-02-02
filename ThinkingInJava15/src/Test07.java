import java.util.ArrayList;
import java.util.List;

public class Test07 {
	public static ArrayList<Integer> method(int size){
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<size;i++){
			if(i<2){
				list.add(1);
			}else{
				Integer next=list.get(i-2)+list.get(i-1);
				list.add(next);
			}
		}
		return (ArrayList<Integer>) list;
	}
	public static void main(String args[]){
		System.out.println(method(18));
	}
}
