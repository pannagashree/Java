import java.util.*;
class ReplaceSpace{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=str1.replaceAll(" ","");
		System.out.println(str2);
	}
}