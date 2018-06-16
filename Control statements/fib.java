import java.util.*;
class Fibanacci{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt();
		int fib0=0;
		int fib1=1;
		System.out.print(fib0+","+fib1+",");
		for(int i=2;i<n;i++)
		{
			int fib=fib0+fib1;
			System.out.print(fib+ ",");
			fib0=fib1;
			fib1=fib;
		}

	}
}
