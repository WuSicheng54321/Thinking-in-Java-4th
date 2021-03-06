import java.util.ArrayList;
import java.util.Random;

class Room{
	private final int id;
	private String description;
	private double peopleNum;
	public Room(int IDnumber,String descr,double peopleNum){
		id=IDnumber;
		description=descr;
		this.peopleNum=peopleNum;
	}
	public String toString(){
		return id+": "+description+", propleNum+ "+peopleNum;
	}
	public static Generator<Room> generator=
			new Generator<Room>() {
			private Random rand=new Random(47);
				public Room next() {
					return new Room(rand.nextInt(100),"Test",Math.round(rand.nextInt()));
				}
			};
}
class Layer extends ArrayList<Room>{
	public Layer(int nRoom){
		Generators.fill(this, Room.generator, nRoom);
	}
}
class Holl extends ArrayList<Layer>{
	public Holl(int nLayer,int nRoom){
		for(int i=0;i<nLayer;i++){
			add(new Layer(nRoom));
		}
	}
}
class Checkout{}
class Office1{}
public class Test19 extends ArrayList<Holl>{
	private ArrayList<Checkout> checkouts=new ArrayList<>();
	private Office1 office=new Office1();
	public Test19(int nHoll,int nLayer,int nRoom){
		for(int i=0;i<nHoll;i++){
			add(new Holl(nLayer,nRoom));
		}
	}
	public String toString(){
		StringBuilder result=new StringBuilder();
		for(Holl h:this){
			for(Layer l:h){
				for(Room r:l){
					result.append(r);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	public static void main(String args[]){
		System.out.println(new Test19(12,10,2));
	}
}
