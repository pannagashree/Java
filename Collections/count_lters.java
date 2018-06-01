import java.util.*;
class LetterCount{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c:str.toCharArray())
			map.put(c,str.length()-str.replaceAll(Character.toString(c),"").length());
		Comparator<Character> sortByvalue=new Comparator<Character>(){
			public int compare(Character e1,Character e2){return map.get(e2).compareTo(map.get(e1));}
		};
		TreeMap<Character,Integer> sorted=new TreeMap<Character,Integer>(sortByvalue);
		sorted.putAll(map);
		Map.Entry<Character,Integer> entry=sorted.firstEntry();
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}