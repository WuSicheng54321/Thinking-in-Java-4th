class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			System.out.println("egg.yolk");
		}
	}
	public Egg() {
		System.out.println("new egg");
		y=new Yolk();
	}
}
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk() {
			System.out.println("Bigegg.yolk");
		}
	}
	public static void main(String args[]){
		new BigEgg();
	}
}