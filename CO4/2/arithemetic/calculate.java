package arithemetic;

public class calculate implements arithe_interface  {
	int a,b;
	public calculate(int i,int j){
		this.a=i;
		this.b=j;
	}
	
	public void add(){
		System.out.println("Sum="+a+b);
	}
	
	public void sub(){
		System.out.println("Difference="+a+b);
	}
	
	public void mult(){
		System.out.println("Multiplication="+a*b);
	}
	
	public void div(){
		System.out.println("Division="+a/b);
	}
}
