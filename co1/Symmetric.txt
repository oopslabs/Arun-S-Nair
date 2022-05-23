import java.util.Scanner;
public class Symmetric {

	public static void main(String[] args) {
		int m[][]=new int[5][5];
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of the matrix");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
						m[i][j]=s.nextInt();
				}
		}
		
		int t[][]=new int[5][5];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
					t[j][i]=m[i][j];
			}
		}
		
		int f=1;
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
						if(m[i][j]!=t[i][j]){
							f=0;
						}
					}
		}
		if(f==1){
			System.out.println("Given matrix is a symmetric matrix");
		}
		else{
			System.out.println("Given matrix is not a symmetric matrix");
		
		}

	}

}
