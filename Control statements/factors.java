import java.util.*;
import java.lang.Math.*;
class Factors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> arr=new ArrayList<Integer>();
		int incrementer=(n%2==0)?1:2;
		//Finding all factors
		/*for(int i=2;i<=(int)Math.sqrt(n);i+=incrementer)
		{
			if(n%i==0)
				arr.add(i);
				if(i!=n/i)
					arr.add(n/i);
		}*/
		//To find smallest factors	
		int num=n;
		for(int i=2;i<=(int)Math.sqrt(num);i++)
		{
			while(n%i==0)
			{
				//System.out.println(n);
				arr.add(i);
				n=n/i;
			}
		}
		Collections.sort(arr);
		System.out.println(arr);
	}
}