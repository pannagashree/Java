import java.util.*;
class Pattern2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
	 	int n=sc.nextInt();
		int no_of_stars=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(2*i);j++)
				System.out.print(" ");
			for (int j=1;j<=no_of_stars;j++)
				System.out.print("* ");
			no_of_stars-=2;
			System.out.println();
		}
	}
}