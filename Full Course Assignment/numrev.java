import java.util.*;
class NumberReverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,rev=0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reversed number is "+Integer.toString(rev));
	}
}