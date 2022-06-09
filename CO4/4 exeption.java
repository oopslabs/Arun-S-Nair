import java.util.Scanner;


public class exep4{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int t=0,avg=0,m=n;
		System.out.println("Enter the numbers ");
		for(int i=0;i<n;i++){
			try{
				t=s.nextInt();
				if(t<0){
					n++;
					throw new negexe("Negative number entered");
				}
				else{
					avg+=t;
				}
			}catch(negexe e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Average of n positive numbers: "+(avg/m));
		
	}
}

class negexe extends Exception{
	negexe(String msg){
		super(msg);
	}
}
