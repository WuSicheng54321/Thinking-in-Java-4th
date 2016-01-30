import java.util.ArrayList;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Breaburn extends Apple{}
public class GenericsAndUpcasting {
	public static void main(String args[]){
		ArrayList<Apple> apples=new ArrayList<>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Breaburn());
		for(Apple a:apples){
			System.out.println(a);
		}
	}
}
