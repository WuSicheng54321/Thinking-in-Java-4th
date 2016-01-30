import java.util.*;

import typeinfo.pets.*;

public class PetMap {
	public static void main(String args[]){
		Map<String,Pet> petMap=new HashMap<>();
		petMap.put("My cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));	
		System.out.println(petMap);
		Pet dog=petMap.get("My Dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("My Dog"));
		System.out.println(petMap.containsValue(dog));
	}
}
