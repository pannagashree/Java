import java.util.*;
import java.lang.System.*;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
class BlockingQ extends Thread{
	static Queue<Integer> q=new LinkedList<Integer>();
	public void run(){
		System.out.println(Thread.currentThread().getName());
		Scanner sc=new Scanner(System.in);
		try{
		while(true){
		TimeUnit.SECONDS.sleep(5);
		System.out .println("Enter 1 to insert,2 to remove,3 to exit");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
			System.out.println("Enter the element to be inserted");
			int num=sc.nextInt();
			addElement(num);
			break;
			case 2:
			deleteElement();
			break;
			case 3:System.exit(0);
		}
	}}catch(InterruptedException e){
		System.out.println("Interrupt catched");
	}
}
public void addElement(Integer num){
	synchronized(q){
	try{
	while(q.size()==5){
		System.out.println("Queue is full");
		q.wait();
		System.out.println("Waiting...");
	}
	q.add(num);
	System.out.println("Added");
	q.notifyAll();
	System.out.println("Notified all");
	}catch(InterruptedException e){
		System.out.println("Interrupt catched");
	}
	}
}
public void deleteElement(){
	synchronized(q){
	try{
	while(q.isEmpty()){
		System.out.println("Queue is empty");
		q.wait();
		System.out.println("Waiting...");
	}
	System.out.println("The removed element is="+Integer.toString(q.remove()));
	q.notifyAll();
	System.out.println("Notified all");
	}catch(InterruptedException e){
		System.out.println("Interrupt catched");
	}
	}
} 
public static void main(String[] args) {
	BlockingQ obj1=new BlockingQ();
	BlockingQ obj2=new BlockingQ();
	try{
	Thread th1=new Thread(obj1,"A");
	Thread th2=new Thread(obj2,"B");
	th1.start();
	Thread.sleep(10000);
	th2.start();
	}catch(InterruptedException e){
		System.out.println("Interrupt catched");
	}
}
}