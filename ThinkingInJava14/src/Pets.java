import java.util.ArrayList;

import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;

public class Pets {
	public static final PetCreator creator=new LiteralPetCreator();
	public static Pet randomPet(){
		return creator.randomPet();
	}
	public static Pet[] createArray(int size){
		return creator.createArray(size);
	}
	public static ArrayList<Pet> arrayList(int size){
		return creator.arrayList(size);
	}
	public static void main(String args[]){
		PetCount.countPets(Pets.creator);
	}
}
