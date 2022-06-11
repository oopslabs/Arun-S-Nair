import java.util.*;
public class ArrList{
	public static void main(String[] args){
		ArrayList<String> cars=new ArrayList<>();
		Scanner s=new Scanner(System.in);
		int ch,index;
		String name;
		System.out.println("1-add\n2-remove\n3-display\n4-Exit\n");
		do{
			System.out.println("Enter the choice");
			ch=s.nextInt(); s.nextLine();
			switch(ch){
				case 1: System.out.println("Enter the car name");
					name=s.nextLine();
					cars.add(name);
					break;
				case 2: System.out.println("Enter the index to remove item");
					index=s.nextInt(); s.nextLine();
					cars.remove(index);
					break;
				case 3:System.out.println("\nCars are :");
					for(String i:cars){
			            	   System.out.println(i);
					}
					break;
			}
		}while(ch!=4);
		
		
		
		
	}
}
