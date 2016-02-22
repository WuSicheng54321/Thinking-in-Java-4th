import java.util.*;

public class GenericWriting {
	static <T> void writeExact(List<T> list,T item){
		list.add(item);
	}
	static List<Apple> apples=new ArrayList<>();
	static List<Fruit> fruit=new ArrayList<>();
	static void f1(){
		writeExact(fruit, new Apple());
		writeExact(apples, new Apple());
	}
	
	static <T> void writeWithcard(List<? super T> list,T item){
		list.add(item);
	}
	static void f2(){
		writeWithcard(apples, new Apple());
		writeWithcard(fruit, new Apple());
	}
	public static void main(String[] args) {
		f1();
		f2();
	}
}
