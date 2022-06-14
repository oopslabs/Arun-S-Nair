package exam;
import java.util.*;

public class stackimp {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		Scanner in=new Scanner(System.in);
		int ch,d;
		
		System.out.println("1-Push\n2-pop\n3-display\n4-Exit");
		
		do {
			System.out.println("Enter the choice");
			ch=in.nextInt();
			switch(ch) {
				case 1:System.out.println("Enter the data");
						d=in.nextInt();
						st.push(d);
						break;
				case 2:st.pop();
						break;
				case 3:st.display(); break;
			}
		}while(ch!=4);
	}

}


class Stack<T>{
	LinkedList<T> s=new LinkedList<>();
	int top=-1;
	
	void push(T data) {
		top++;
		if(s.size()>top) {
			s.set(top, data);
		}
		else {
			s.add(data);
		}
	}
	
	void pop() {
		top--;
	}
	
	void display() {
		for(int i=top;i>-1;i--) {
			System.out.println(s.get(i));
		}
	}
}
