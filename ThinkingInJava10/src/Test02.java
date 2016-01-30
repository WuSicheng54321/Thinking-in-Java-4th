class A02{
	private String s="in outer";
	class A02Inner{
		public String toString(){
			return s;
		}
	}
}
public class Test02 {
	public static void main(String[] args){
//		Sequence sequence=new Sequence(10);
//		for(int i=0;i<10;i++){
//			sequence.add(new A02().toString());
//		}
//		Selector selector=sequence.selector();
//		while(!selector.end()){
//			System.out.println(selector.current());
//			selector.next();
//		}
		A02 a02=new A02();
		A02.A02Inner a=a02.new A02Inner();
		System.out.println(a.toString());
	}
}
