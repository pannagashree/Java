import java.util.*;
class Palindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String src=sc.nextLine();
		String rev=new StringBuilder(src).reverse().toString();
		if(src.equals(rev)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}