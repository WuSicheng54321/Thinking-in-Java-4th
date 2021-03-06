class GenericBase<T>{
	private T element;
	public void set(T arg){
		arg=element;
	}
	public T get(){
		return element;
	}
}
class Derived1<T> extends GenericBase<T>{}
@SuppressWarnings("rawtypes")
class Derived2 extends GenericBase{}
/*c
 * lass Derived3 extends GenericBase<?>{}
The type Derived3 cannot extend or implement 
GenericBase<?>. A supertype may not specify any wildcard
*/
public class ErausreAndInheritance {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		Derived2 d2=new Derived2();
		Object obj=d2.get();
		d2.set(obj);
	}
}
