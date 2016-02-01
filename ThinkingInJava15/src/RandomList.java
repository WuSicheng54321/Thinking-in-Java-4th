import java.util.*;

public class RandomList<T> {
	private ArrayList<T> storage=new ArrayList<T>();
	private Random rand=new Random(47);
	public void add(T item){
		storage.add(item);
	}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String args[]){
		RandomList<String> rs=new RandomList<>();
		for(String s:"tjof jaoj aoj ajoa ao ao a".split(" ")){
			rs.add(s);
		}
		for(int i=0;i<11;i++){
			System.out.print(rs.select()+" ");
		}
		RandomList<Integer> ri=new RandomList<>();
		Integer[] integer={1,2,3,4,5};
		for(Integer i:integer){
			ri.add(i);
		}
		for(int i=0;i<11;i++){
			System.out.print(ri.select()+" ");
		}
		RandomList<Double> rd=new RandomList<>();
		Double[] db={1.2,3.4,1.3};
		for(Double d:db){
			rd.add(d);
		}
		for(int i=0;i<11;i++){
			System.out.print(rd.select()+" ");
		}
	}
}
