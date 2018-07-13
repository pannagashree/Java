import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class ThraedPool implements Runnable{
	static final int maximum=3;
	public void run(){
		try{
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println("Interrupt catched");
		}
	}
	public static void main(String[] args) {
		ThraedPool obj1=new ThraedPool();
		ThraedPool obj2=new ThraedPool();
		ThraedPool obj3=new ThraedPool();
		ThraedPool obj4=new ThraedPool();
		ThraedPool obj5=new ThraedPool();

		ExecutorService pool=Executors.newFixedThreadPool(maximum);
		pool.execute(obj1);	/*Since maximum is set to 3,first 3 threads will be executed first and then next set of 3 threads(here remaining is just 2) will be executed*/
		pool.execute(obj2);
		pool.execute(obj3);
		pool.execute(obj4);
		pool.execute(obj5);

		pool.shutdown();
	}
}