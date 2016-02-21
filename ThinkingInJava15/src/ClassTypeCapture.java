import java.util.*;

class Building{}
class House extends Building{}

public class ClassTypeCapture<T> {
	Class<T> kind;
	Map<String,Class<?>> result;
	public ClassTypeCapture(Class<T> kind) {
		this.kind=kind;
	}
	public boolean f(Object arg){
		return kind.isInstance(arg);
	}
	public Map addType(String typename,Class<?> kind){
		result.put(typename, kind);
		return result;
	}
	public void createNew(String typename){
		result.keySet();
	}
	public static void main(String args[]){
		ClassTypeCapture<Building> ctt1=new ClassTypeCapture<>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		ClassTypeCapture<House> ctt2=new ClassTypeCapture<>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
	}
}
