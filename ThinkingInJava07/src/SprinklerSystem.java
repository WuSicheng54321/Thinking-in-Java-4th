import tool.P;

class WaterSource{
	private String s;
	public WaterSource() {
		// TODO Auto-generated constructor stub
		P.tln("WaterSource()");
		s="Constructed";
	}
	public String toString(){
		return s;
	}
}
public class SprinklerSystem {
	private String value1,value2,value3,value4,value5;
	private WaterSource source=new WaterSource();
	private int i;
	private float f;
	public String toString(){
		return 
			"value1="+value1+" "+
			"value2="+value2+" "+
			"value3="+value3+" "+
			"value4="+value4+" "+
			"value5="+value5+"\n"+
			"i="+i+" "+"f="+f+" "+
			"source="+source;
	}
	public static void main(String args[]){
		SprinklerSystem sprinkler=new SprinklerSystem();
		P.tln(sprinkler);
	}
}
