import java.util.*;

import typeinfo.pets.*;

public class CollectionSquence{
	private Pet[] pets=Pets.createArray(8);
	private Collection<Pet> petsc;
	public int size(){
		return pets.length;
	}
	public void display(Collection<Pet> petsc1){
		for(int i=0;i<pets.length;i++){
			petsc.add(pets[i]);
		}
		for(Pet p:petsc){
			System.out.print(p.id()+":"+p+" ");
		}
		System.out.println();
	}
	public Collection<Pet> getPet(){
		return petsc;
	}
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>() {
			private int index=0;
			@Override
			public Pet next() {
				// TODO Auto-generated method stub
				return pets[index++];
			}
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index<pets.length;
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public static void main(String args[]){
		CollectionSquence c=new CollectionSquence();
		System.out.println(c.getPet());
		c.display(c.getPet());
		InterfaceVsIterator.display(c.iterator());
	}
}
