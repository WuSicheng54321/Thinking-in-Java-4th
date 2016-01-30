
public class parcel7 {
	public Contents contents(){
		return new Contents(){
			private int i=11;
			public int value(){
				return i;
			}
		};
	}
	public static void main(String args[]){
		parcel7 p=new parcel7();
		Contents c=p.contents();
	}
}
