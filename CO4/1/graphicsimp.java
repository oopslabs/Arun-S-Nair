import graphics.*;
public class graphicsimp {

	public static void main(String[] args) {
		
		circle c1=new circle(3);
		System.out.println("Area of circle with radius 3");
		c1.area();
		
		
		rectangle r1=new rectangle(2,3);
		System.out.println("Area of rectangle with length 2 and breadth 3");
		r1.area();
		
		
		triangle t1=new triangle(5,3);
		System.out.println("Area of triangle with b=5 and heigth 3");
		t1.area();
		
		square s1=new square(5);
		System.out.println("Area of square with side 5");
		s1.area();
		
		
	}

}
