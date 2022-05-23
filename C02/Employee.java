import java.util.Scanner;

public class Employee {
	int eno,esalary;
	String ename;
	Employee(int i,String j,int k){
		eno=i;
		ename=j;
		esalary=k;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++){
			System.out.println("Employee"+i+1);
			System.out.println("Enter the Employee name");
			String b=s.nextLine();
			System.out.println("Enter the Employee number");
			int a=s.nextInt();
			System.out.println("Enter the Employee Salary");
			int c=s.nextInt();
			s.nextLine();
			emp[i]=new Employee(a,b,c);
		} 
		
		System.out.println("Enter the Employee number to search");	
		int q=s.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if(emp[i].eno==q){
					flag=1;
					System.out.println("Employee number="+emp[i].eno);
					System.out.println("Employee name="+emp[i].ename);
					System.out.println("Employee Salary="+emp[i].esalary);
			}
		}
		if(flag==0){
			System.out.println("No such employee");
		}
	}
}
