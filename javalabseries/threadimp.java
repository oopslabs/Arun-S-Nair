package exam;
import java.util.*;


public class threadimp {

	public static void main(String[] args) {
		First obj1=new First();
		obj1.start();

	}

}

class First extends Thread{
	
	public synchronized void run() {
		double i=Math.random()*100;
		int j=(int) Math.floor(i);
		System.out.println("Number= "+j);
		if(j%2==0) {
			Second obj2=new Second(j);
			obj2.start();
		}
		else {
			Third obj3=new Third(j);
			obj3.start();
		}
	}
}

class Second extends Thread{
	int num;
	Second(int j){
		num=j;
	}
	public synchronized void run() {
		System.out.println("Square: "+(num*num));
	}
}

class Third extends Thread{
	int num;
	Third(int j){
		num=j;
	}
	public synchronized void run() {
		System.out.println("Cube: "+(num*num*num));
	}
}

