import java.util.*;
class DecimalToBinary{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String binarynum="";
		int rem;
		while(num!=1){
			rem=num%2;
			num=num/2;
			binarynum=Integer.toString(rem)+binarynum;
		}
		binarynum=num+binarynum;
		System.out.println(binarynum);
	}
}