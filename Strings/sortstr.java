import java.util.*;
class Sort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		char []temp=str1.toCharArray();
		Arrays.sort(temp);
		System.out.println(temp);
	}
}