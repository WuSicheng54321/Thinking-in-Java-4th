interface Selector{
	boolean end();
	Object current();
	void next();
}
public class Test12 {
	private Object[] items;
	private int next=0;
	public Test12(int size){
		items=new Object[size];
	}
	public void add(Object x) throws ArrayIndexOutOfBoundsException{
		try{
			items[next++]=x;
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace(System.out);
		}

	}
	private class Test12Selector implements Selector{
		private int i=0;
		public boolean end(){
			return i==items.length;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if(i<items.length){
				i++;
			}
		}
		public Test12 outer(){
			return Test12 .this;
		}
	}
	public Selector selector(){
		return new Test12Selector();
	}
	public static void main(String[] args){
		Test12 Test12=new Test12(5);
		for(int i=0;i<10;i++){
			Test12.add(Integer.toString(i));
		}
		Selector selector=Test12.selector();
		while(!selector.end()){
			System.out.println(selector.current()+" ");
			selector.next();
		}
	}

}