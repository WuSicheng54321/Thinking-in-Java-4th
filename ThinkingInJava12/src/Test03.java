
public class Test03 {
	public static void main(String args[]){
		int[] i={1,2,3,4};
		try{
			int c=i[10];
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
}
