package co4;

import java.util.*;
import java.util.Scanner;

public class pq {

	public static void main(String[] args) {
		int n;
		String str;
		PriorityQueue<String> pqueue=new PriorityQueue<>();
		System.out.println("Total count");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		s.nextLine();
		System.out.println("Enter data");
		for(int i=0;i<n;i++){
			str=s.nextLine();
			pqueue.add(str);
		}
		System.out.println("Peek: "+pqueue.peek());
		System.out.println("Data in Queue");
		//System.out.println(pqueue);
		Iterator<String> itr1=pqueue.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
		
		System.out.println("Polling: "+pqueue.poll());
		
		System.out.println("After polling data in Queue");
		//System.out.println(pqueue);
		Iterator<String> itr2=pqueue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next()); 
		}   
	}

}
