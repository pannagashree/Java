import java.util.*;
class DigitSum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit= sc.nextInt();
		int sum=0,rem;
		while(digit!=0){
			rem=digit%10;
			digit=digit/10;
			sum+=rem;
		}
		System.out.println(sum);
	}
}