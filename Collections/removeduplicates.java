import java.util.*;
class Duplicates{
	public static void main(String []args){
		ArrayList<Integer> obj=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			obj.add(sc.nextInt());
		Set<Integer>rdupobj=new HashSet<Integer>();
		for(Integer o:obj){
			rdupobj.add(o);
		}
		System.out.println("The elements are:");
		for(Integer i:rdupobj){
			System.out.printf("%d ",i);
		}
	}
}