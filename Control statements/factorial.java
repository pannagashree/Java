import java.util.*;
class Factorial{
	static int facto(int n){
		if(n==1)
			return n;
		return n*facto(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int fact=facto(n);
		System.out.println(fact);
	}
}