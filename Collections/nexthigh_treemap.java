import java.util.*;
class NextHighest{
	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		Integer x=sc.nextInt();
		while(sc.hasNext())
			tm.put(sc.nextInt(),"");
		System.out.println("The next highest value="+tm.higherKey(x));
	}
}