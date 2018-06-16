import java.util.*;
class Reverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int revdig=0;
		while(n!=0)
		{
			int rem=n%10;
			revdig=revdig*10+rem;
			n=n/10;
		}
		System.out.println(revdig);	
	}
}