
public class Test08 {
	public static void main(String args[]) throws NewException2{
		try {
			throw new NewException2();
		} catch (NewException2 e) {
			e.printStackTrace();
		}
	}

}
