package Book.Example;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
	public static void main(String[] args) {
		File file=new File(".");
		String list[]=null;
		if(args.length==0){
			list=file.list();
		}else{
			list=file.list(new DirFilter(args[0]));
		}
		Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
		for(String s:list){
			System.out.println(s);
		}
	}
}

class DirFilter implements FilenameFilter{
	private Pattern pattern;
	public DirFilter(String regex){
		pattern=Pattern.compile(regex);
	}
	public boolean accept(File dir,String name){
		return pattern.matcher(name).matches();
	}
}
