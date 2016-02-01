class Amphibian{}
class Vehicle{}
public class TupleTest {
	static TwoTuple<String, Integer> f(){
		return new TwoTuple<String, Integer>("hi", 47);
	}
	static ThreeTuple<Amphibian,String,Integer> g(){
		return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(), "hi", 47);
	}
	static FourTuple<Vehicle,Amphibian,String,Integer> h(){
		return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(), new Amphibian(), "hi", 47);
	}
	static FiveTuple<Vehicle,Amphibian,String,Integer,Double> i(){
		return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(), new Amphibian(), "hi", 47, 3.14);
	}
	static SixTuple<Vehicle,Amphibian,String,Integer,Double,Character> j(){
		return new SixTuple<Vehicle, Amphibian, String, Integer, Double, Character>(new Vehicle(), new Amphibian(), "hi", 47, 3.14, 'c');
	}
	public static void main(String args[]){
		System.out.println(f());
		System.out.println(g());
		System.out.println(h());
		System.out.println(i());
		System.out.println(j());
	}
}
