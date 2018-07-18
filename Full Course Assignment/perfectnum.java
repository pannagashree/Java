import java.util.*;
class PerfectNumber{
	static int poitivefactorsum(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=poitivefactorsum(num);
		if(sum==num){
			System.out.println("PerfectNumber");
		}
		else
			System.out.println("Not a PerfectNumber");
	}
}