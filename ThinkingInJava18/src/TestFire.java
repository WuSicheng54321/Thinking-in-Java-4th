import java.io.File;
import java.io.IOException;

public class TestFire {
	public static void main(String[] args) {
		String separator=File.separator;
		String path="skdir1"+separator+"skdir2";
		String name="file.txt";
		File f=new File(path,name);
		if(f.exists()){
			System.out.println("the file name is"+f.getName());
			System.out.println("the length is"+f.length());
			System.out.println(f.getAbsolutePath());
		}else{
			f.getParentFile().mkdirs();
			try{
				f.createNewFile();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
