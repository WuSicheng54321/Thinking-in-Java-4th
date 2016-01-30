import java.util.*;

public class UniqueWords {
	public static void main(String args[]){
		Set<String> words=new TreeSet<>(new TextFile("SetOperations.java","\\W+"));
		System.out.println(words);
	}
}