import java.util.*;
class Sorting3Numbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		if(num1>num2)
		{
			//Swapping without temporary variable
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
		}
		if(num2>num3){
			num2=num3+num2;
			num3=num2-num3;
			num2=num2-num3;	
		}
		if(num1>num2)
		{
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
		}
		System.out.println(num1+" "+num2+" "+num3);
	}
}