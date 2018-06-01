import java.util.*;
class SumEqualToX{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Integer x=sc.nextInt();
		Integer[] array=new Integer[n];
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		HashMap<Integer,ArrayList> dict=new HashMap<Integer,ArrayList>();
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				dict.put(array[i]+array[j],new ArrayList<Integer>(Arrays.asList(array[i],array[j])));
		for(Iterator<Integer> it=dict.get(x).iterator();it.hasNext();)
			System.out.printf("Set=%d,%d",it.next(),it.next());
	}
}