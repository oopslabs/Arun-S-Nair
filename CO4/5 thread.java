import java.io.*;
import java.util.Scanner;

public class threadimp{
	public static void main(String[] args){
		mul obj1=new mul();
		prime obj2=new prime();
		obj1.start();
		obj2.start();
	}
}

class mul extends Thread{
	public synchronized void run(){
		System.out.println("Multiplication table");
		for(int i=1;i<=10;i++){
		System.out.println(i*5);
		}
	}
}

class prime extends Thread{
	int n;
	Scanner s=new Scanner(System.in);
	
	public prime(){
		System.out.println("Enter n for prime numbers");
		n=s.nextInt();
	}
	public synchronized void run(){
		int p=0;
		for(int i=2;i<n;i++){
			p=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					p=1;
				}
			}
			if(p==0){
				System.out.println(i+" is prime");
			}
		}
	}
	}
