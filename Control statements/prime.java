import java.util.*;
/*The algorithm can be improved further by observing that all primes are of the form 6k ± 1, with the exception of 2 and 3.
 This is because all integers can be expressed as (6k + i) for some integer k and for i ranging from 1 to 5; 2 divides (6k + 0), (6k + 2), (6k + 4); and 3 divides (6k + 3).
 So left out will be (6k+1) and (6k+5) which can be written as 6k ± 1.
 Therefore,a more efficient method is to test if n is divisible by 2 or 3, then to check through all the numbers of form 6k ± 1.*/
class PrimeOrNot{
	static boolean isPrime(int n){
		if(n<1) return false;
		if(n<3)	return true;

		if(n%2==0 || n%3==0)	//checking for divisibility by 2 amd 3 
			return false;

		//starting with 6k-1 with k=1 and k incremented as 2,3,4.. as for loop proceeds by incrementing i by 6 in each loop
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)	//checking if i(6k-1) or i+2(6k+1) is a factor of n
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		boolean prime=isPrime(n);
		if(prime==true)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");

	}
}