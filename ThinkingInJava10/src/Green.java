public class Green {
	private int first;//原有量
	private int speedEat=1;//羊吃草的速度
	private int speedGrow;//草生长的速度
	private int many=21;//羊的个数
	//计算first和speedGrow参数
	public void factor(){
		for(int i=0;i<100;i++){
			for(int j=0;j<100;j++){
				if((i+6*j==27*6)&&(i+9*j==23*9)){
					first=i;
					speedGrow=j;
				}
			}
		}
	}
	//判断相等
	public void balance(){
		for(double week=0;week<100;week++){
			if((many*week*speedEat)==(first+week*speedGrow)&&week>0){
				System.out.println(week);
			}
		}
	}
	public static void main(String args[]){
		Green f=new Green();
		f.factor();
		f.balance();
	}
}
