import java.util.Scanner;

public class stringman {
	String str;
	stringman(String i){
			str=i;
	}
	void display(){
			System.out.println(str);
	}
	void ind(String i){
		System.out.println(str.indexOf(i));
	}
	public static void main(String[] args) {
		int ch;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.nextLine();
		stringman s1=new stringman(st);
		s1.display();
		do{
			System.out.println("1-Index\n2-Length\n3-Lowercase\n4-Uppercase\n5-Starting letter\n6-Concatenate\n7-comparison\n0-exit\nEnter the choice");
			ch=s.nextInt();
			s.nextLine();
			
			switch(ch){
			case 1: System.out.println("Enter the substring");
					String q=s.nextLine();
					s1.ind(q);
				break;
			case 2: System.out.println(s1.str.length());
				break;
			case 4:System.out.println(s1.str.toUpperCase());
				break;
			case 3:System.out.println(s1.str.toLowerCase());
				break;
			case 5:System.out.println(s1.str.charAt(0));
				break;
			case 6:System.out.println("Enter additional string");
					String q1=s.nextLine();
					System.out.println(s1.str.concat(" ").concat(q1));
				break;
			case 7:System.out.println("Enter the string to compare");
					String q3=s.nextLine();
					int res=s1.str.compareTo(q3);
					if(res==0){
						System.out.println("The two strings are equal");
					}
					else if(res<0){
						System.out.println("The new string is larger than the old");
					}
					else{
						System.out.println("The new string is shorter than the old");
					}
				break;
			}
		}while(ch!=0);
	}

}
