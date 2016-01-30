import tool.P;

class lazy{
	String s;
	lazy(){
		P.tln("lazy()");
		s="lazy";
	}
	public String toString(){
		return s;
	}
}
public class Test01 {
	public static void main(String args[]){
		int i=1;
		lazy la ;
		if(i==1){
			la=new lazy();
			P.tln(la);
		}else if(i==2){

		}
	}

}
