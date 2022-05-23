import java.util.Scanner;

public class stringsort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		char arr[]=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
					if(arr[j]<arr[i]){
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
			}
		}
		System.out.println(arr);

	}

}
