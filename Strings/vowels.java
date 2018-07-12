import java.util.*;
class Vowel{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int c=0;
		String vowels="aeiou";
		for(int i=0;i<str.length();i++)
		{
			if(vowels.indexOf(str.charAt(i))!=-1)
			{
				System.out.println(str.charAt(i));
				c+=1;
			}
		}
		System.out.println(c);
	}
}