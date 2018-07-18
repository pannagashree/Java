import java.util.*;
import java.lang.Thread;
class Deadlock extends Thread{
	public static void main(String[] args) {
		//int a,b;	/*Not possible because synchronized needs reference types and not value tpes as its  argument,therefore we need to use Integer wrapper class*/
		Integer a=new Integer(5);
		Integer b=new Integer(6);
		// t1 tries to lock a then b
		Thread t1=new Thread(){
			public void run(){
				synchronized(a){
					System.out.println("Thread1 locked a");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
					/*It cannot lock b because t2 would have already locked it*/
					synchronized(b){
						System.out.println("Thread1 locked b");
					}
				}
			}
		};
		// t2 tries to lock b then a
		Thread t2=new Thread(){
			public void run(){
				synchronized(b){
					System.out.println("Thread1 locked b");
					try{Thread.sleep(1000);
					}catch(Exception e){}
					/*It cannot lock a because t1 would have already locked it*/
					synchronized(a){
						System.out.println("Thread1 locked a");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
	
}