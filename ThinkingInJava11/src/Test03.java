import java.util.ArrayList;

interface Selector{
	boolean end();
	Object current();
	void next();
}
public class Test03 {
	private ArrayList<Object> items;
	private int next=0;
	public Test03(int size){
		items=new ArrayList<>();
	}
	public void add(Object x){
		if(next<items.size()){
			items.add(x);
		}
	}
	private class SequenceSelector implements Selector{
		private int i=0;
		public boolean end(){
			return i==items.size();
		}
		public Object current(){
			return items.get(i);
		}
		public void next(){
			if(i<items.size()){
				i++;
			}
		}
		public Test03 outer(){
			return Test03 .this;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args){
		Test03 sequence=new Test03(10);
		for(int i=0;i<10;i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector=sequence.selector();
		while(!selector.end()){
			System.out.println(selector.current()+" ");
			selector.next();
		}
	}

}

