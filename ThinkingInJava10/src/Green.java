public class Green {
	private int first;//ԭ����
	private int speedEat=1;//��Բݵ��ٶ�
	private int speedGrow;//���������ٶ�
	private int many=21;//��ĸ���
	//����first��speedGrow����
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
	//�ж����
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
