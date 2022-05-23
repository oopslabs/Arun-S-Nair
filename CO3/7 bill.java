import java.util.Scanner;
import java.util.Date;


public class bill implements outline{
	int id,quantity,unit,total,orderid;
	String  name;
	Date d;
	
	public void addItem(){
		System.out.println("\nEnter the item id");
		id=s.nextInt();
		s.nextLine();
		System.out.println("\nEnter the item name");
		name=s.nextLine();
		System.out.println("\nEnter the item quantity");
		quantity=s.nextInt();
		System.out.println("\nEnter the item unit price");
		unit=s.nextInt();
		s.nextLine();
		total=unit*quantity;
		
	}
	public void forHeader(){
		d=new Date();
		System.out.println("Enter the Order ID");
		orderid=s.nextInt();
		s.nextLine();
		
	}
	public void showHeader(){
		
		System.out.println("\nOrder ID : "+orderid);
		System.out.println("\nDate :"+d.toString());
	}
	
	public void prepareBill(){
		
		System.out.format("%10d %10s %10d %10d %10d",id,name,quantity,unit,total);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch=1;
		int n=5,i=0,net=0;
		bill newbill[]=new bill[n];
		while(ch==1 && i<n ){
			System.out.println("Ttem "+(i+1));
			newbill[i]=new bill();
			if(i==0){	
				newbill[i].forHeader();
			}
			newbill[i].addItem();
			i++;
			System.out.println("Enter 1 to add more items");
			ch=s.nextInt();
		}
		newbill[0].showHeader();
		System.out.printf("%10s %10s %10s %10s %10s","PRODUCT ID", "NAME", "QUANTITY", "UNIT PRIZE", "TOTAL");
		System.out.println();
		for(int z=0;z<55;z++){
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++){
			newbill[j].prepareBill();
			System.out.println();
		}
		for(int z=0;z<55;z++){
			System.out.print("-");
		}
		System.out.println();
		for(int j=0;j<i;j++){
			net+=newbill[j].total;
		}
		System.out.println("Net Amount :"+net);
	}

}

interface outline{
	Scanner s=new Scanner(System.in);
	public void prepareBill();
	void addItem();
	void forHeader();
	void showHeader();
	
	
	
}
