import java.util.*;

public class map{
	public static void main(String[] args){
	
	Map<Integer,String> mapp=new HashMap<Integer,String>();
		
	mapp.put(3,"Java");
	mapp.put(2,"C");
	mapp.put(1,"Python");
	
	System.out.println("Map: "+mapp);
	
	mapp.put(2,"C++");
	mapp.put(null,"SQL");
	System.out.println("Map after updation: "+mapp);
	
	
	mapp.remove(3);
	System.out.println("Map after deletion: "+mapp);
	
	System.out.println("\nAccessing using Map.Entry Interface");
	for (Map.Entry<Integer, String> me :mapp.entrySet()){
   		System.out.println(me.getKey() + ":" +me.getValue() );
	}

	}
}
