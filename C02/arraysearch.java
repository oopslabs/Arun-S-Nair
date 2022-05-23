import java.util.Scanner;

public class arraysearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int key=s.nextInt();
		int flag=0;
		for(int i=0;i<arr.length;i++){
				if(arr[i]==key){
						System.out.println("Item found at index"+i);
						flag=1;
				}
		}
		if(flag==0){
				System.out.println("Item not found");
		}
		
	}

}
