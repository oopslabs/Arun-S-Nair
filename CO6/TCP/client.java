import java.net.*;
import java.io.*;
public class client{
	public static void main(String args[]) throws Exception{
		try{
			Socket sk = new Socket("localhost", 1234);
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("HELLO SERVER ..!!!!!");
//Client is reading from its InputStream
			InputStreamReader isr = new InputStreamReader(sk.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str=br.readLine();
			System.out.println("MESSAGE FROM SERVER: "+str);
			pw.close();
			sk.close();
		}catch(Exception e){
			System.out.println("An error occured.." +e);
		}
	}
}
