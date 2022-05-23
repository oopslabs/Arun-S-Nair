import java.util.Scanner;

class product{
	int pcode,price;
	String pname;
	void input(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the product code ");
		pcode=s.nextInt();
		s.nextLine();
		System.out.println("Enter the product name ");
		pname=s.nextLine();
		System.out.println("Enter the product price ");
		price=s.nextInt();
	}
	void display(){
		System.out.println(pcode);
		System.out.println(pname);
		System.out.println(price);
	}
	
	public static void main(String[] args){
		product obj1=new product();
		obj1.input();
		product obj2=new product();
		obj2.input();
		product obj3=new product();
		obj3.input();
		System.out.println("First Object");
		obj1.display();
		System.out.println("Second Object");
		obj2.display();
		System.out.println("Third Object");
		obj3.display();
		
		if(obj1.price > obj2.price && obj1.price > obj3.price){
			System.out.println("First Object has highest price");
		}
		
		if(obj2.price > obj1.price && obj2.price > obj3.price){
			System.out.println("Second Object has highest price");
		}
		
		if(obj3.price > obj2.price && obj3.price > obj1.price){
			System.out.println("Third Object has highest price");
		}
		
		
	}
}

