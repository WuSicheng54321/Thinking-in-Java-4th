
public class Test05 {
	public static void main(String args[]){
		int i=-1;
		while(i<1){
			System.out.println("example");
			i++;
			try{
				int c=10/i;
			}catch(Exception e){
				e.printStackTrace(System.out);
			}
		}
	}
}
