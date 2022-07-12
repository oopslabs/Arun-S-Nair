import java.util.*;

public class hset{
	public static void main(String[] args){
		HashSet<String> set1=new HashSet<>();
		HashSet<String> set2=new HashSet<>();
		HashSet<String> set3=new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		
		set2.add("A");
		set2.add("B");
		set2.add("C");
		set2.add("D");
		
		set3.add("A");
		set3.add("B");
		set3.add("C");
		set3.add("D");
		set3.add("E");
		
		System.out.println("1: "+set1+"\n2: "+set2+"\n3: "+set3);
		System.out.println("Both sets 1 and 2 are equal: "+set1.equals(set2));
		System.out.println("Both sets 1 and 3 are equal: "+set1.equals(set3));
		
		
	}
}
