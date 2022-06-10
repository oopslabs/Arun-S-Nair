import java.util.*;

public class DoubbleEndQueue{
	public static void main(String[] args){
		Deque<String> dq=new LinkedList<>();
		dq.add("one");
		dq.add("two");
		dq.addFirst("Three");
		dq.addLast("Four");
		dq.push("Five");
		dq.offer("Six");
		dq.offerFirst("Seven");
		System.out.print("DEQUE:  "+dq+" ");
		
		dq.removeFirst();
		System.out.println("\nDEQUE after removing first element");
		System.out.print(dq+" ");
		
		dq.removeLast();
		System.out.println("\nDEQUE after removing last element");
		System.out.print(dq+" ");
		 
	}
}
