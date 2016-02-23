import java.io.*;

public class TestFireInputStream {
	public static void main(String[] args) {
		FileReader in=null;
		FileWriter out=null;
		int b=0;
		long num=0;
		try{
			in=new FileReader("/home/wusicheng/workspace/ThinkingInJava18"
					+ "/src/TestFireInputStream.java");
			out=new FileWriter("/home/wusicheng/workspace/ThinkingInJava18"
					+ "/src/HW.java");
			while((b=in.read())!=-1){
				out.write(b);
				System.out.print((char)b);
				num++;
			}
			in.close();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("找不到文件");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("文件已读取"+num+"字节");
		System.out.println("文件已复制");
	}
}
