import java.util.*;
class AverageOfInts{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList<>();
		int in,sum=0;
		do{
			in=sc.nextInt();
			arr.add(in);
		}while(in!=0);
		for(int i=0;i<arr.size();i++)
			if(arr.get(i)!=0)
				sum+=arr.get(i);
		double avg=(double)sum/(arr.size()-1);
		System.out.println(sum+" "+avg);

	}
}