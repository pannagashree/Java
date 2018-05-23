import java.util.*;
class SortArrayList{
	private ArrayList<Integer> obj=new ArrayList<Integer>();
	public SortArrayList(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			obj.add(sc.nextInt());
	}
	public void sorting(){
		for(int i=0;i<obj.size()-1;i++)
		{
			for(int j=0;j<(obj.size()-1-i);j++)
				if(obj.get(j)>obj.get(j+1))
				{
					Integer temp=obj.get(j);
					obj.set(j,obj.get(j+1));
					obj.set(j+1,temp);
				}
		}
	}
	public void display(){
		System.out.println("The elements are:");
		for(Integer i:obj)
			System.out.println(i);
	}
}
class SortTesting{
	public static void main(String[] args) {
		SortArrayList list=new SortArrayList();
		list.sorting();
		list.display();
	}

}