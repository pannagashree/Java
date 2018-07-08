import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Checkipv4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		Pattern p=Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
		System.out.println(p.matcher(in).matches());
	}
}