import java.io.*;

public class TestInputStreamReader {
	public static void main(String[] args) {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		try {
			String s=br.readLine();
			while(!s.equals(null)){
				System.out.println(s.toUpperCase());
				if(s.equalsIgnoreCase("exit")) {break;}
				s=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
