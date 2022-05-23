import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch;
		Inter I;
		Circle obj1= new Circle();
		
		Rectangle obj2=new Rectangle();
		do{
			System.out.println("1-Area of Circle\n2-Perimeter of Circle\n3-Area of Rectangle\n4-Perimeter of Rectangle\n0-Exit\nEnter the choice");
			ch=s.nextInt();
			switch(ch){
			case 1:I=obj1;
			I.area();
				break;
			case 2:I=obj1;
			I.perimeter();
			break;
			case 3:I=obj2;
			I.area();
				break;
			case 4:I=obj2;
			I.perimeter();
			break;
			default:System.out.println("Invalid");
			}
		}while(ch!=0);
		

	}

}

interface Inter{
	void area();
	void perimeter();

}

class Circle implements Inter{
	public void area(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		System.out.println("Area of Circle= "+(3.14*r*r));
		
	}
	public void perimeter(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		System.out.println("Perimeter of Circle= "+(2*3.14*r));
	}
}

class Rectangle implements Inter{
	public void area(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		int l=s.nextInt();
		int b=s.nextInt();
		System.out.println("Area of Rectangle= "+(l*b));
		
		
	}
	
	public void perimeter(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		int l=s.nextInt();
		int b=s.nextInt();
		System.out.println("Perimeter of Rectangle= "+(2*(l+b)));
	}
}
	
