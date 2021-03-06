package Book.Test;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortedDirList {
	String[] list=null;
	long num;
	public SortedDirList(File path){
		list=path.list();
		num=path.length();
	}
	public String[] list(){
		for(String s:list){
			System.out.print(s+" ");
		}
		return list;
	}
	public String[] list(String regex){
		for(String s:list){
			Matcher m=Pattern.compile(regex).matcher(s);
			while(m.find()){
				System.out.print(m.group()+" \n"+s.length());
			}
		}
		return list;
	}
	public static void main(String[] args) {
		SortedDirList sd=new SortedDirList(new File("/home/wusicheng/workspace"));
		sd.list();
		System.out.println("===================================");
		sd.list("ThinkingInJava..");
//		System.out.println(sd.num);
	}
}
