import java.util.*;
class Duplicate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		ArrayList<Character>m=new ArrayList<Character>();
		Set<Character> s=new HashSet<Character>();
		for(int i=0;i<str1.length();i++){
			Character ch=str1.charAt(i);
			if(m.contains(str1.charAt(i)))
			{
				if(s.add(ch)){
					s.add(ch);
					continue;
				}
			}
			else
				m.add(ch);
		}
		System.out.println(s);
}
}