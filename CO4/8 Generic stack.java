import java.io.*;
import java.util.*;

public class genimp{
	public static void main(String[] args){
		Stack<Integer> obj1=new Stack<Integer>(3);
		System.out.println("Pushing 10,20,30 into an integer stack...");
		obj1.push(10);
		obj1.push(20);
		obj1.push(30);
		System.out.println("After Pushing");
		obj1.display();
		obj1.pop();
		System.out.println("After poping");
		obj1.display();
		System.out.println("Pushing 40");
		obj1.push(40);
		System.out.println("After pushing");
		obj1.display();
		
		System.out.println("A String type stack");
		Stack<String> obj2=new Stack<>(3);
		obj2.push("Java");
		obj2.push("Programming");
		obj2.push("Tutorial");
		obj2.display();
		System.out.println("Top= "+obj2.topp());
	
		
	}
}

class Stack<T>{
	ArrayList<T> stack;
	int n,top=-1;
	
	Stack(int i){
		this.n=i;
		this.stack=new ArrayList<T>(i);
	}
	
	void push(T data){
		if((top+1)==n){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			if(stack.size()>top){
				stack.set(top,data);
			}
			else{
				stack.add(data);
			}
		}
	}
	
	void display(){
		for(int i=top;i>-1;i--){
			System.out.println(stack.get(i));
		}
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		else{
			top--;
		}
	}
	T topp(){
		return(stack.get(top));
	}
	
}
	
