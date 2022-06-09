import arithemetic.*;
import java.util.Scanner;
public class arithemetic_imp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		calculate c1=new calculate(a,b);
		
		c1.add();
		c1.sub();
		c1.mult();
		c1.div();

	}

}
