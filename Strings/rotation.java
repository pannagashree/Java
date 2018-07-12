import java.util.*;
class Rotation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String test_str=str1+str1;
		if(test_str.indexOf(str2)!=-1)
			System.out.println("Rotation");
		else
			System.out.println("Not Rotation");
		
	}
}