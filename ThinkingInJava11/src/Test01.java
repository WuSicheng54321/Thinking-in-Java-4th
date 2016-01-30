import java.util.ArrayList;
import java.util.Iterator;

class Gerbil{
	private int gerbilNumber=0;
	private int id=0;
	public Gerbil(int gerbilNumber){
		this.gerbilNumber=gerbilNumber;
	}
	public void hop(){
		System.out.print(gerbilNumber+" ");
		System.out.println("jump");
		
		
	}
	public int getId(){
		return gerbilNumber;
	}
}
public class Test01 {
	public static void display(Iterator<Gerbil> it){
		while(it.hasNext()){
			Gerbil g=it.next();
			g.hop();
		}
	}
	public static void main(String args[]){
		ArrayList<Gerbil> gerbil=new ArrayList<>();
		Iterator<Gerbil> it=gerbil.iterator();
		gerbil.add(new Gerbil(0));
		gerbil.add(new Gerbil(1));
		gerbil.add(new Gerbil(2));
		gerbil.add(new Gerbil(3));
		gerbil.add(new Gerbil(4));
		gerbil.add(new Gerbil(5));
		for(int i=0;i<gerbil.size();i++){
			gerbil.get(i).hop();
		}
		System.out.println(gerbil);
		display(gerbil.iterator());
	}

}
