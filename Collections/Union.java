import java.util.*;
class TestUnion{
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		list1.addAll(list2);
		return list1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		ArrayList<Integer> obj2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements for 1st List:");
		for(int i=0;i<5;i++)
			obj1.add(sc.nextInt());
		System.out.println("Enter 5 elements for 2nd List:");
		for(int i=0;i<5;i++)
			obj2.add(sc.nextInt());
		System.out.println("Obj1 elements:");
		for(Object o:obj1){
			System.out.printf("%d ",o);}
		System.out.println("\nObj2 elements:");
		for(Object o:obj2){
			System.out.printf("%d ",o);}
		ArrayList<Integer> mergedList=union(obj1,obj2);
		System.out.println("\nThe merged list is:");
		for(Object o:mergedList){
			System.out.printf("%d ",o);
		}
	}
}