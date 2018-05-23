import java.util.*;
class MaxValue{
	public static Integer maxvalue(ArrayList<Integer> numbers)
	{
		int max;
		if (numbers==null || numbers.isEmpty())
			return null;
		else
			max=numbers.get(0);
			for(int i=0;i<numbers.size();i++)
				if(numbers.get(i)>max)
					max=numbers.get(i);
			return max;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>(n);
		for (int i=0;i<n;i++) {
			nums.add(sc.nextInt());			
		}
		int maximumvalue=maxvalue(nums);
		System.out.println(maximumvalue);
	}
}