import java.util.*;
class KSmallSum{
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
			ts.add(sc.nextInt());
		int sum=0;
		Iterator<Integer> it=ts.iterator();
		for(int i=0;i<k;i++){
			sum+=it.next();
		}
		System.out.println(sum);
	}
}