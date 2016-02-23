import java.io.*;

public class TestPrintStream2 {
	public static void main(String[] args) {
		PrintStream ps=null;
		try{
			FileOutputStream fos=new FileOutputStream("/home/wusicheng/workspace/test.txt");
			ps=new PrintStream(fos);
		}catch(IOException e){
			e.printStackTrace();
		}
		if(ps!=null){
			System.setOut(ps);
		}
		for(int i=0;i<60000;i++){
			if(i%100==0){
				System.out.print((char)i+" ");
				System.out.println();
				System.out.println("==================================");
			}else{
				System.out.print((char)i+" ");
			}
		}
		System.setOut(System.out);
		System.out.println(ps.getClass());
	}
}
