import java.util.Scanner;
class Complex{
	int real,img;
	
	public void input(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the real part");
		real=s.nextInt();
		System.out.println("Enter the imaginary part");
		img=s.nextInt();
	}
	
	public void display(){
		System.out.println(real+"+"+(img)+"i");
	}
	
	public static void main(String args[]){	
		Complex n1=new Complex();
		Complex n2=new Complex();
		
		System.out.println("First Complex Number");
		n1.input();
		
		System.out.println("Second Complex Number");
		n2.input();
		
		n1.display();
		n2.display();
		System.out.println("Result");
		System.out.println(n1.real+n2.real+"+"+(n1.img+n2.img)+"i");		
	}
}
