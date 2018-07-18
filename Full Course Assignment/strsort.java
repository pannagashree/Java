import java.util.*;
class StringSort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		char[] input=in.toCharArray();
		Arrays.sort(input);
		System.out.println(new String(input));
	}
}