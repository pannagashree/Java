import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Url{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String in=sc.nextLine();
		Pattern p=Pattern.compile("^(https?:\\/\\/)?(www\\.)?([\\w]+\\.)+([‌​\\w]+\\/)+[‌​\\w]{2,63}(\\/|\\.[\\w]+)?$");
		Matcher m=p.matcher(in);
		boolean match=m.matches();
		if(match)
			System.out.println("True");
		else
			System.out.println("False");
	}
}