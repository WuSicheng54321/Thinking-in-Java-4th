import java.util.*;
import typeinfo.pets.*;

public class MapOfList {
	public static Map<Person,List<? extends Pet>> petPeople=new HashMap<>();
	static{
		petPeople.put(new Person("Dawn"),Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
		petPeople.put(new Person("Dawn2"),Arrays.asList(new Cymric("Molly2"),new Mutt("Spot2")));
		petPeople.put(new Person("Dawn3"),Arrays.asList(new Cymric("Molly3"),new Mutt("Spot3")));
		petPeople.put(new Person("Dawn4"),Arrays.asList(new Cymric("Molly4"),new Mutt("Spot4")));
	}
	public static void main(String args[]){
		System.out.println("people: "+petPeople.keySet());
		System.out.println("Pets: "+petPeople.values());
		for(Person person:petPeople.keySet()){
			System.out.print(person+" has");
			for(Pet pet:petPeople.get(person)){
				System.out.print("  "+pet);
			}
			System.out.println();
		}
		
	}
}
