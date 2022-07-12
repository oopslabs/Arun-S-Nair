import java.io.*;
import java.util.*;

public class q3{
	public static void main(String args[]) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first file:");
		String file1=sc.next();
		System.out.println("enter the Second file:");
		String file2 =sc.next();
		sc.close();
		FileReader fin = new FileReader(file1);
		FileWriter fout = new FileWriter(file2, true);
		int c;
		while ((c = fin.read()) != -1){
			fout.write(c);
		}
		System.out.println("copy file1 to file2 ");
		fin.close();
		fout.close();
	}
}
