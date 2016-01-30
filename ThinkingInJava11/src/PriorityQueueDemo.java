import java.util.*;

public class PriorityQueueDemo {
	public static void main(String args[]){
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
		Queue<Integer> queue=new LinkedList<>();
		Random rand=new Random(47);
		for(int i=0;i<10;i++){
			priorityQueue.offer(rand.nextInt(10));
			queue.offer(10);
		}
		QueueDemo.printQ(priorityQueue);
		QueueDemo.printQ(queue);
		
		List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priorityQueue=new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		priorityQueue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
//		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		
		String fact="EDUCATION SHOULD ESOULD OBFUSCATION";
		List<String> strings=Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ;
		stringPQ=new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);
		
		Set<Character> charSet=new HashSet<>();
		for(char c:fact.toCharArray()){
			charSet.add(c);
		}
		PriorityQueue<Character> characterPQ=new PriorityQueue<>(charSet);
		QueueDemo.printQ(characterPQ);
	}
}
