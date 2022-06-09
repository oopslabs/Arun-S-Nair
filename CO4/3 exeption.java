import java.util.Scanner;
class PasswordExec extends Exception{
	PasswordExec(String msg){
		super(msg);
	}
}
public class ex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String u=s.nextLine();
		System.out.println("Enter the password");
		String p=s.nextLine();
		
		
		try{	
			if(u.length()<8){
					throw new PasswordExec("Username Length less than 8");
			}
			else if(p.length()<8){
				throw new PasswordExec("Password less than 5");
			}
			else{
				System.out.println("Login successfull");
			}
				
			}catch(PasswordExec e){
				System.out.println(e.getMessage());
		}
		
	
	}

}
