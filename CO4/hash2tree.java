import java.util.*;

public class hash2tree{
	public static void main(String[] args){
		Map<Integer,String> hm=new HashMap<>();
		hm.put(1,"One");
		hm.put(2, "Two");
	     	hm.put(15, "Fifteen");
	      	hm.put(7, "Seven");
	      	hm.put(3, "Three");
	     	hm.put(9, "Nine");	
	     	System.out.println("Hashmap: "+hm);
	   	
	     	Map<Integer,String> tm=new TreeMap<>();
	     	tm.putAll(hm);
	     	System.out.println("\nTreemap from Hashmap: "+tm);
	     		
		
	}
}
