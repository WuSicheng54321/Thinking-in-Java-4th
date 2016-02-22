
public class Holder5<T> {
	private T value;
	public Holder5(){}
	public Holder5(T val){
		value=val;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder5<Apple> Apple=new Holder5<>(new Apple());
		Apple d=Apple.getValue();
		Apple.setValue(d);
		Holder5<Fruit> Fruit=Apple;
	}
}
