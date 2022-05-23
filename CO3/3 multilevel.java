import java.util.Scanner;

public class multilevel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		
		Teacher obj[]= new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			System.out.println("Enter the name");
			String a=s.nextLine();
			System.out.println("Enter the age");
			int b=s.nextInt();
			s.nextLine();
			System.out.println("Enter the gender");
			String c=s.nextLine();
			System.out.println("Enter the address");
			String d=s.nextLine();
			
			System.out.println("Enter the Employee ID");
			int e1=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Company name");
			String e2=s.nextLine();
			System.out.println("Enter the Qualification");
			String e3=s.nextLine();
			System.out.println("Enter the salary");
			int e4=s.nextInt();
			s.nextLine();
			
			System.out.println("Enter the Teacher ID");
			int t1=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Department");
			String t2=s.nextLine();
			System.out.println("Enter the Subject");
			String t3=s.nextLine();
			
			obj[i]=new Teacher(a,b,c,d,e1,e2,e3,e4,t1,t2,t3);
		}
		s.close();
		
		System.out.println("DETAILS");
		for(int i=0;i<n;i++){
			System.out.println("Teacher"+(i+1));
			obj[i].display();
		}

	}

}
class Person{
	int age;
	String name,gender,address;
	Person(String a,int b,String c,String d){	
		this.name=a;
		this.age=b;
		this.gender=c;
		this.address=d;
	}
}

class Employeee extends Person{
	int empid,salary;
	String comp_name,qualification;
	Employeee(String a,int b,String c,String d,int eid,String cname,String quali,int sal){
			super(a,b,c,d);
			this.empid=eid;
			this.comp_name=cname;
			this.qualification=quali;
			this.salary=sal;
					
			
	}
}

class Teacher extends Employeee{
	String dept,sub;
	int t_id;
	Teacher(String a,int b,String c,String d,int eid,String cname,String quali,int sal,int tid,String dep,String subj){
		super(a,b,c,d,eid,cname,quali,sal);
		this.dept=dep;
		this.sub=subj;
		this.t_id=tid;
	}
	void display(){
			System.out.println("Name:"+name+"\nAge:"+age+"\nGender:"+gender+"\nAddress"+address+"\nEmployee ID:"+empid+"\nCompany Name:"+comp_name+"Salary:"+salary+"\nQualifications:"+qualification+"\nTeacher ID:"+t_id+"\nDepartment:"+dept+"\nSubject:"+sub);
	}
	
}
