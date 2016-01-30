import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class NewException1 extends Exception{
	private static Logger logger=Logger.getLogger("NewException1");
	public NewException1(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class NewException2 extends Exception{
	private static Logger logger=Logger.getLogger("NewException2");
	public NewException2(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class Test06 {
	public static void main(String args[]){
		try {
			throw new NewException1();
		} catch (NewException1 e) {
			System.err.println(e);
		}
		try {
			throw new NewException2();
		} catch (NewException2 e) {
			System.err.println(e);
		}
	}
}
