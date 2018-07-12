import java.util.*;
class NonRepeat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str1.length();i++){
			Character ch=str1.charAt(i);
			if(m.containsKey(str1.charAt(i)))
			{
				m.put(ch,m.get(ch)+1);
			}
			else
				m.put(ch,1);
		}
		for(Map.Entry<Character,Integer> e:m.entrySet())
			if(e.getValue()==1){
				System.out.println(e.getKey());
				break;
			}
	}
}