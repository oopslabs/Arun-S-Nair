import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n,flag=0;
		System.out.println("Enter num");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int j=2;j<n/2;j++){
			if(n%j==0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println(n+" is prime");
		}
		else{
			System.out.println(n+" is not prime");
		}
	}

}
