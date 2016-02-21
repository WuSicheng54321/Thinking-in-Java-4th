class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind){
		try{
			x=kind.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class Employee{}

public class InstantiateGenericType {
	public static void main(String args[]){
		ClassAsFactory<Employee> fe=new ClassAsFactory<>(Employee.class);
		p("E is success");
		try{
			ClassAsFactory<Integer> fi=new ClassAsFactory<>(Integer.class);
		}catch(Exception e){
			p("Integer is fail");
		}
	}
	public static void p(Object obj){
		System.out.println(obj);
	}
}
