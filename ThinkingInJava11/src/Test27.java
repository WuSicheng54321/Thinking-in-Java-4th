import java.util.*;

class Command{
	private String s="hello";
	public String operation(){
		return s;
	}
}
class A27{
	Queue<Command> q=new LinkedList<>();
	public Command f(){
		Command c=new Command();
		for(int i=0;i<10;i++){
			q.offer(c);
		}
		return c;
	}
}
public class Test27 {
	public static void main(String args[]){
		A27 a27=new A27();
		while(a27.q.peek()!=null){
			System.out.println(a27.q.remove());
			a27.f().operation();
		}
	}
}
