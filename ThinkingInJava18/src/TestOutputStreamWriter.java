import java.io.*;

public class TestOutputStreamWriter {
	public static void main(String[] args) {
		try {
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("/home"
					+ "/wusicheng/workspace/ThinkingInJava18/src/TO.java"));
			FileReader fr=null;
			int b=0;
			try {
				osw.write("hello\n");
				System.out.println(osw.getEncoding());
				osw.close();
				fr=new FileReader("/home"
						+ "/wusicheng/workspace/ThinkingInJava18/src/TO.java");
				while((b=fr.read())!=-1){
					System.out.print((char)b);
				}
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
