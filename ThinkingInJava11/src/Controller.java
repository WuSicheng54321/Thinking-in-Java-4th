import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
	protected static List<Event> eventList=new LinkedList<>();
	protected static Iterator<Event> it=eventList.iterator();
	public void addEvent(Event c){
		eventList.add(c);
	}
	public static void display(Iterator<Event> it){
		while(it.hasNext()){
			Event e=it.next();
			System.out.println(e);
		}
	}
	public void run(){
		while(eventList.size()>0){
			while(it.hasNext()){
				Event e=it.next();
				System.out.println(e);
				e.action();
				eventList.remove(e);
			}
		}
	}
}