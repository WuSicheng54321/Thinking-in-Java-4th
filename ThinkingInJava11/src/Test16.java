import java.util.*;

public class Test16 {
	public static void main(String args[]){
		Set<String> words=new TreeSet<>();
		LinkedList<String> uniqueWords=new LinkedList<>();
		uniqueWords.addAll(new TextFile("UniqueWords.java", "\\W+"));
		Collections.addAll(words,"aeiou".split(""));
		Iterator<String> it=uniqueWords.iterator();
		int num = 0;
		int all=0;
		while(it.hasNext()){
			String s=it.next();
			char[] c=s.toCharArray();
			for(int i=0;i<c.length;i++){
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
					num++;
				}
			}
			System.out.print(num+" ");
			all=all+num;
			num=0;
		}
		System.out.println();
		System.out.println(all);
		System.out.println(words);
		System.out.println(uniqueWords);
		}
}
