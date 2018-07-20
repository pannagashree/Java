import java.util.*;
class CommonElements{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer[] arr1={24,34,12,11,78,99,100};
		Integer[] arr2={56,24,11,18,90,78};
		ArrayList<Integer> commons=new ArrayList<Integer>();
		List<Integer> l=new ArrayList<Integer>(Arrays.asList(arr2));
		for(int i=0;i<arr1.length;i++)
			if(l.contains(arr1[i]))
				commons.add(arr1[i]);
		for(int i=0;i<commons.size();i++)
			System.out.println(commons.get(i));

	}
}