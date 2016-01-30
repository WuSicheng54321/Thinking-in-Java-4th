//继承父类的子类中，必须继承父类的非默认构造器
class Base{
	Base(int i){
		System.out.println("Base constructor "+i);
	}
}
class Son extends Base{
	Son(int i){
		super(i);
		System.out.println("Son constructor "+i);
	}
	Son(){
		System.out.println("Son constructor base");
	}
}
public class Test08 {

}
