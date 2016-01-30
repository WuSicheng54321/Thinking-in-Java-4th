
public interface Months {
	int JANUARY=1;
}
class Test17 implements Months{
	public static void main(String args[]){
		System.out.println(JANUARY);
//		JANUARY=4; The final field Months.JANUARY cannot be assigned
	}
}
