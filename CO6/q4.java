import java.io.*;
import java.util.Scanner;
public class q4{
	public static void main(String args[]) throws IOException{
		FileInputStream fr = new FileInputStream("/home/arun/Desktop/Data/sem 2/java/c06/integer");
		FileOutputStream fw1 = new FileOutputStream("/home/arun/Desktop/Data/sem 2/java/c06/even");
		FileOutputStream fw2 = new FileOutputStream("/home/arun/Desktop/Data/sem 2/java/c06/odd");
		System.out.println("\nCopy Successfull\n");
		int i;
		while((i=fr.read()) != -1){
			if(i%2==0)
				fw1.write(i);
			else
				fw2.write(i);
		}
		fr.close();
		fw1.close();
		fw2.close();
	}
}
