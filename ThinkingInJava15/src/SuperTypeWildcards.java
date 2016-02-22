import java.util.List;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
//		apples.add(new Fruit());
		apples.add(new Jonathan());
		apples.add(new Orange());
	}
}
