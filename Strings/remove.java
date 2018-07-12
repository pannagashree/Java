import java.util.*;
class Remove{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String new_str=str1;
		for(int i=0;i<str1.length();i++)
		{
			if(str2.indexOf(str1.charAt(i))!=-1)
			{
				String ch=Character.toString(str1.charAt(i));
				new_str=new_str.replaceAll(ch,"");
			}
		}
		System.out.println(new_str);
	}
}