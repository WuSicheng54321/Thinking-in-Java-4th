import java.io.*;

public class TestPrintStream3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String filename=null;
		if(filename!=null){
			list(filename,System.out);
		}
	}
	public static void list(String s,PrintStream ps){
		try {
			BufferedReader br=new BufferedReader(new FileReader(s));
			String t=null;
			while((t=br.readLine())!=null){
				System.out.print(t);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
