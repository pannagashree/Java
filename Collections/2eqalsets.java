import java.util.*;
import java.lang.*;
class TwoEqualABCD{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		HashMap<Integer,ArrayList> s=new HashMap<Integer,ArrayList>();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				sum=arr[i]+arr[j];
				if(s.containsKey(sum))
				{
					ArrayList<Integer> p=s.get(sum);
					System.out.printf("(%d and %d),(%d and %d)",arr[i],arr[j],p.get(0),p.get(1));
					System.exit(0);
				}
				else
					s.put(sum,new ArrayList<Integer>(Arrays.asList(arr[i],arr[j])));
			}
	}
}