import java.util.*;
class SortByValue{
	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("abc",10);
		h.put("efg",5);
		h.put("jkl",7);
		h.put("qrs",19);
		Set s=h.entrySet();
		List<Map.Entry<String,Integer>> l=new ArrayList<>(s);
		Collections.sort(l,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		for(Map.Entry<String,Integer>e:l)
			lh.put(e.getKey(),e.getValue());
		for(Map.Entry<String,Integer>e:lh.entrySet()){
			System.out.printf("%s %d",e.getKey(),e.getValue());
			System.out.println();
		}

	}
}