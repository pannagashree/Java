import java.util.*;
class MostDuplicate{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		Map<Character,Integer>m=new HashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++){
			Character ch=str1.charAt(i);
			if(m.containsKey(str1.charAt(i)))
			{
				m.put(ch,m.get(ch)+1);
			}
			else
				m.put(ch,1);
		}
		Character mc=Collections.max(m.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
		System.out.println(mc);
}
}