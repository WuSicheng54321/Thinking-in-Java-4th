import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Test28 {
	public static void main(String args[]){
		Random rand=new Random(47);
		PriorityQueue<Double> priorityQueue=new PriorityQueue<>();
		for(int i=0;i<10;i++){
			priorityQueue.offer(rand.nextDouble());
		}
		System.out.println(priorityQueue);
		Iterator<Double> it=priorityQueue.iterator();
//		while(it.hasNext()){
//			Double d=it.next();
//			System.out.println(d);
//		}
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.poll());
	}
}
