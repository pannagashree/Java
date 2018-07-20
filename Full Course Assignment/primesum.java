import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
class PrimeSum{
	public static void main(String[] args) {
		int sum=0;
		List<Integer> nums=IntStream.range(1,1001).boxed().collect(Collectors.toList());
		/* sieve of Eratosthenes is one of the most efficient ways to find all primes smaller than n when n is smaller than 10 million or so */
		int p=2;
		boolean flag=true;
		while(flag){
		for(int i=2*p;i<=1000;i+=p){
			nums.remove((Integer)i);
		}
		flag=false;
		for(int i=0;i<nums.size();i++)
			if(nums.get(i)>p){
				flag=true;
				p=nums.get(i);
				break;
			}
		}
		for(Integer i:nums)
			System.out.printf("%d ",i);
		System.out.println();
		for(Integer i:nums)
			sum+=i;
		System.out.println("Sum ="+Integer.toString(sum));
	}
}