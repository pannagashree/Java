import java.util.*;
class StringReverse{
	static String reverse(String str){
		if((str==null)||(str.length()<=1))
			return str;
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("The reversed string is "+reverse(name));
	}
}