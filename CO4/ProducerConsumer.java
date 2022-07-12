import java.util.*;

public class ProducerConsumer{
	public static void main(String[] args){
	
	List<Integer> shared_list=new ArrayList<>();
		
		Thread t1=new Thread(new Producer(shared_list));
		Thread t2=new Thread(new Consumer(shared_list));
		
		t1.start();
		t2.start();
	}
}


class Producer implements Runnable{
	List<Integer> shared_list;
	final int LIMIT=5;
	int i=0;
	
	public Producer(List<Integer> shared_list){
		this.shared_list=shared_list;
	}
	
	public void run(){
		while(true){
			try{
				produce(i++);
			}catch(InterruptedException e){
			
			}
		}
	}
	
	public void produce(int i) throws InterruptedException{
		synchronized(shared_list){
			while(shared_list.size()==LIMIT){
				System.out.println("List full....");
				shared_list.wait();
			}
		}
		synchronized(shared_list){
			System.out.println("Produced item "+i);
			shared_list.add(i);
			
			shared_list.notify();
			Thread.sleep(1000);
		}
		
	}
	
}


class Consumer implements Runnable{
	List<Integer> shared_list;
	
	public Consumer(List<Integer> shared_list){
		this.shared_list=shared_list;
	}
	
	public void run(){
		while(true){
			try{
				consume();
			}catch(InterruptedException e){
			
			}
		}
	}
	
	public void consume() throws InterruptedException{
		synchronized(shared_list){
			while(shared_list.isEmpty()){
				System.out.println("List Empty....");
				shared_list.wait();
			}
		}
		synchronized(shared_list){
			
			System.out.println("Consume the item"+shared_list.remove(0));
			Thread.sleep(100);
			shared_list.notify();
		}
		
	}
	
}

