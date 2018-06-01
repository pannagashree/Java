import java.util.*;
class KSmallest{
	public static void main(String[] args) {
		//Comparator<Integer> comp=new ValueComparator();
		PriorityQueue<Integer> q1=new PriorityQueue<>(10,(a,b)->a-b);//Ascending order
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
			q1.add(sc.nextInt());
		Integer p=0;
		int m=k;
		/*while(q1.size()!=0)
			System.out.println(q1.poll());*/
		while(k>0){
			p=q1.poll();
			k--;
		}
		System.out.println("The "+m+"th largest element:"+p);
	}
}