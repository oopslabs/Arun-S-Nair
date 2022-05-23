import java.util.Scanner;
public class overload {
	void area(int a){
		System.out.println("Area of Square= "+a*a);
	}
	void area(int l,int b){
		System.out.println("Area of Rectangle= "+l*b);
	}
	void area(float r){
		System.out.println("Area of Circle= "+3.14*r*r);
	}
	
	public static void main(String[] args) {
		int ch;
		Scanner s =new Scanner(System.in);
		overload fn=new overload();
		System.out.println("1-Square\n2-Rectangle\n3-Circle\n0-Exit");
		do{
			System.out.println("Enter the choice");
			ch=s.nextInt();
			switch(ch){
			case 1:System.out.println("Enter the side of the square");
					int x=s.nextInt();
					fn.area(x);
					break;
			case 2:System.out.println("Enter the length and breadth of the rectangle");
					int y=s.nextInt();
					int z=s.nextInt();
					fn.area(y,z);
					break;
			case 3:System.out.println("Enter the radius of the circle ");
					float r=s.nextFloat();
					fn.area(r);
					break;
			}
		}while(ch!=0);
		s.close();
	}

}
