import java.util.*;
class Majority{
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		Set<Integer> myset=new HashSet<Integer>(arr);
		HashMap<Integer,Integer> cmap=new HashMap<Integer,Integer>();
		for(Integer i:myset)
			cmap.put(i,Collections.frequency(arr,i));
		for(Map.Entry<Integer,Integer> m:cmap.entrySet())
			if(m.getValue()>(n/2))
			{
				System.out.println(m.getKey());
				return;
			}
	}
}