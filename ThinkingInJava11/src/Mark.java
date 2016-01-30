
public class Mark {
	private int many=50;
	private int correct;
	private int wrong;
	public void mark(){
		for(int i=0;i<51;i++){
			correct=i;
			wrong=many-correct;
			if((correct+2)*2+(wrong-2)*(-2)==60){
				System.out.println(correct);
			}
		}
	}
	public static void main(String args[]){
		Mark m=new Mark();
		m.mark();
	}
}
