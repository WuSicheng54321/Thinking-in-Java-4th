class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class Test01 {
  private String valve1, valve2, valve3, valve4;
  StringBuilder result=new StringBuilder();
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString() {
    	result.append(valve1);
    	result.append(valve2);
    	result.append(valve3);
    	result.append(valve4);
    	result.append(source);
    	return result.toString();
  }	
  public static void main(String[] args) {
    Test01  sprinklers = new Test01();
    System.out.println(sprinklers);
  }
}