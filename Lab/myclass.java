package Lab;
import java.util.*;

class NegExc extends Exception{
	NegExc(String msg) {
			super(msg);
	}
}
public class myclass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		System.out.println("\nEnter the numbers");
		int k,avg=0;
		
		for(int i=0;i<n;i++){
			try{
				k=s.nextInt();
				if(k<0){
					i--;
					throw new NegExc("Negative number Entered");
					
				}
				else{
						avg+=k;
				}
				
			}catch(NegExc e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("\nAverage: "+(avg/n));

	}

}
