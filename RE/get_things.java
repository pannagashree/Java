import java.util.*;
class GetFromUrl{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		String protocol=url.substring(0,url.indexOf(':'));
		String domain=url.substring(url.indexOf('/')+2,url.lastIndexOf(':'));
		String temp=url.substring(url.lastIndexOf(':'),url.length()-1);
		String path_str=temp.substring(temp.indexOf('/'),temp.indexOf('?'));
		System.out.printf("%s\t%s\t%s",protocol,domain,path_str);

	}
}