import java.util.*;

public class linkedimp{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		linked<String> l1=new linked<>();
		int ch;
		String str;
		do{
			System.out.println("\n1-insert\n2-display\n3-clear LL\n4-Exit\nEnter the choice");
			ch=s.nextInt(); s.nextLine();
			switch(ch){
				case 1:System.out.println("Enter the String");
					str=s.nextLine();
					l1.insert(str);
					break;
				case 2:l1.display();break;
				case 3:l1.clear();l1.display();break;
			}
		}while(ch!=4);
	}
}

class linked<T>{

	LinkedList<T> ll=new LinkedList<>();
	
	void insert(T data){
		ll.add(data);
	}
	void display(){
		System.out.println(ll);
	}
	void clear(){
		ll.clear();
		
	}
	
	
}
