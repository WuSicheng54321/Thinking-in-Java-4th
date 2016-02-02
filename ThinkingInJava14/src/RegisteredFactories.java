import java.util.*;

import typeinfo.factory.Factory;

class Part{
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories=new ArrayList<Factory<? extends Part>>();
	static{
		partFactories.add(new FuelFilter.  )
	}
}
public class RegisteredFactories {

}
