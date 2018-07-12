import java.util.*;
class Palindrome1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String src=sc.nextLine();
		String rev="";
		int n=src.length();
		for(int i=n-1;i>=0;i--)
			rev=rev+src.charAt(i);
		if(src.equalsIgnoreCase(rev)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}