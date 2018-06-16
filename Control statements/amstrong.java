import java.util.*;
import java.lang.Math.*;
class Amstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dig=sc.nextInt();
		int num=dig;
		int sum=0;
		int len=(int)Math.log10(dig)+1;
		for(int i=0;i<len;i++)
		{
			int rem=dig%10;
			sum+=Math.pow(rem,len);
			dig=dig/10;
		}
		if(sum==num)
			System.out.println("Amstrong Number");
		else
			System.out.println("Not an Amstrong number");

	}
}