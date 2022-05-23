import java.util.Scanner;

public class myclass{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Literature books");
		int l=s.nextInt();
		Literature lbook[]=new Literature[l];
		
		for(int i=0;i<l;i++){
			System.out.println("Enter the details of Literature book "+(i+1));
			lbook[i]=new Literature();
			
		}
		
	
		System.out.println("Enter the number of Fiction books");
		int f=s.nextInt();
		Fiction fbook[]=new Fiction[f];
		
		for(int i=0;i<f;i++){
			System.out.println("Enter the details of Fiction book"+(i+1));
			fbook[i]=new Fiction();
		}
		int ch;
		do{
			System.out.println("\n1-Literature Book Details\n2-Fiction\n0-Exit\nEnter the choice");
			ch=s.nextInt();
			switch(ch){
				case 1:
					System.out.println("\n**LITERATURE BOOKS**");
					for(int i=0;i<l;i++){
						lbook[i].display();
					}
					break;
				case 2:
					System.out.println("**FICTION BOOKS**");
					for(int i=0;i<f;i++){
						fbook[i].display();
					}
			}
		}while(ch!=0);
	

	}
	
}

class Publisher{
	String pub_name;
	Scanner s=new Scanner(System.in);
	Publisher(){
		System.out.println("Enter the publisher name");
		pub_name=s.nextLine();
	}
	
}
	
class Book extends Publisher{
	String b_name,author;
	Book(){

		System.out.println("Enter the book name");
		b_name=s.nextLine();
		System.out.println("Enter the author name");
		author=s.nextLine();
			
	}
	
}
	
class Literature extends Book{
	String type;
	Literature(){
		type="Literature";

	}
	
	void display(){
		System.out.println("\nBook Name:"+b_name+"\nAuthor"+author+"\nPublisher:"+pub_name+"\nType:"+type);
	}
}
	
class Fiction extends Book{
	String type;
	Fiction(){
		type="Fiction";
	}
	void display(){
		System.out.println("\nBook Name:"+b_name+"\nAuthor"+author+"\nPublisher:"+pub_name+"\nType:"+type);
	}
}

