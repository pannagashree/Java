import java.util.*;
class LargestOfThree{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//System.out.println(((a>b&&a>c)?a:(b>c)?b:c)+" is the largest");
		if(a>b&&a>c)
			System.out.println(a+" is th largest");
		else if(b>c)
			System.out.println(b+" is th largest");
		else
			System.out.println(c+" is the largest");
		
	}
}