import java.util.Scanner;
class Matrix{
	public static void main(String args[]){
		int arr1[][]=new int[5][5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the matrixes");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("Enter the elements in first matrix");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr1[i][j]=s.nextInt();
			}
		}
		
		int arr2[][]=new int[5][5];
		System.out.println("Enter the elements in the second matrix");
		for(int i=0;i<a;i++){	
			for(int j=0;j<b;j++){
				arr2[i][j]=s.nextInt();
			}
		}
		
		int arr3[][]=new int[10][10];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				arr3[i][j]=arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Final Matrix");
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
		
