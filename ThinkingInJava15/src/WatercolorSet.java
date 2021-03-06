import java.util.*;

public class WatercolorSet {
	public static void main(String args[]){
		Set<Watercolors> set1=EnumSet.range(Watercolors.A, Watercolors.D);
		Set<Watercolors> set2=EnumSet.range(Watercolors.A,Watercolors.B);
		System.out.println("Set1: "+set1);
		System.out.println("Set2: "+set2);
		System.out.println("union(set1,set2):"+Sets.union(set1,set2));
		Set<Watercolors> subset=Sets.intersection(set1, set2);
		System.out.println(subset);
		System.out.println();
	}
}
