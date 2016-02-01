
public class GenericClassReferences {
	public static void main(String args[]){
		Class intClass=int.class;
		Class<Integer> genericIntClass=int.class;
		genericIntClass=Integer.class;
		intClass=double.class;
//		genericIntClass=double.class;
//		Class<Number> genericNumberClass=int.class;
		Class<?> intClass2=int.class;
		intClass2=double.class;
		Class<? extends Number> bounded=int.class;
		bounded=double.class;
		bounded=Number.class;
	}
}
