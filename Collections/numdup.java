import java.util.*;
class NumberOfDuplicates{
	public static void main(String[] args) {
		ArrayList<String> var=new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();	//sc.nextInt() does not read the end-of-line, so that' why the effect that .nextLine() is being escaped, while actually that .nextLine() is reading the end-of-line left unread in the input-stream by the .nextInt(). You need an extra .nextLine() after .nextInt()
		for (int i=1;i<=n;++i) {
			var.add(sc.nextLine());
		}
		int count=0;
		for(String s:var)
			System.out.println(s);
		HashMap<String,Integer> var1=new HashMap<String,Integer>();
		for(String s:var){
			if(var1.containsKey(s)==false)
				var1.put(s,Collections.frequency(var,s));
		}
		for(Map.Entry<String,Integer> entry:var1.entrySet()){
			String key=entry.getKey().toString();
			Integer val=entry.getValue();
			System.out.println("key:"+key+" value:"+val);
		}
		for(Map.Entry<String,Integer> entry:var1.entrySet()){
			if(entry.getValue()>1)
				count++;
		}
		System.out.println(count);

	}
}