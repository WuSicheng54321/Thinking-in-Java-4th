package Book.Test;

import java.io.*;

public class Test07 {
	public static void main(String[] args) {
		char s;
		int b=0;
		try {
			FileReader fis=new FileReader("/home/wusicheng/workspace/ThinkingInJava18"
					+ "/src/Book/Test/Test07.java");
			BufferedReader bis=new BufferedReader(fis);
			while((b)!=-1){
					s=(char)b;
					System.out.print(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
