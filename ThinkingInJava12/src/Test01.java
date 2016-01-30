
public class Test01 {
	public static void main(String args[]){
		try{
			int i=1/0;
		}catch(Exception e){
			e.printStackTrace(System.out);
			System.out.println("execption");
		}finally {
			System.out.println("finally");
		}
	}
}
