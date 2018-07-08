import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Check{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		Pattern p=Pattern.compile("(/../|/./)");
		Matcher m=p.matcher(in);
		if(m.find())
			System.out.println("True");
		else
			System.out.println("False");
	}
}