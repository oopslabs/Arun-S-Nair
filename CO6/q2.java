
import java.io.*;

public class q2{
	public static void main(String[] args){
		try{
			FileWriter fw=new FileWriter("/home/arun/Desktop/Data/sem 2/java/c06/file",true);
			fw.write("welcome to programming");
			fw.close();
			
			FileReader reader = new FileReader("/home/arun/Desktop/Data/sem 2/java/c06/file");
			BufferedReader b= new BufferedReader(reader);
			String line;
			System.out.println("\n Data Read From The File \n");
			while ((line = b.readLine()) != null){
				System.out.println(line);
			}
			reader.close();
			
		}
		catch (IOException e){
			System.out.println("\n Error Occured...");
		}
	}
}
