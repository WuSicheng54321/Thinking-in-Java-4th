package Test08;

import java.util.Iterator;
import java.util.*;

public class StroyCharacters  implements Generator<GoodGuys>,
	Iterable<GoodGuys>{
	private Class[] types1={
			A.class,B.class,C.class
	};
	private Class[] types2={
			D.class,E.class,F.class
	};
	private static Random rand =new Random(47);
	public StroyCharacters(){}
	private int size=0;
	public GoodGuys next(){
		try{
			return (GoodGuys) types1[rand.nextInt(types1.length)].newInstance();
		}catch(Exception e){
			throw new RuntimeException();
		}
	}
	class StoryIterator implements Iterator<GoodGuys>{
		int count=size;
		public boolean hasNext(){
			return count>0;
		}
		public GoodGuys next(){
			count--;
			return StroyCharacters.this.next();
		}	
		public void remove(){
			throw new UnsupportedOperationException();
		}
	};
	public Iterator<GoodGuys> iterator(){
		return new StoryIterator();
	}
	public static void main(String args[]){
		StroyCharacters gen=new StroyCharacters();
		for(int i=0;i<5;i++){
			System.out.println(gen.next());
		}
		for(GoodGuys g:new StroyCharacters()){
			System.out.println(g);
		}
	}
}
