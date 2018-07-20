import java.util.*;
class ArraySortDescending{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer[] arr=new Integer[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr,Collections.reverseOrder());	//descending reverseOrder
		System.out.printf("%d %d",arr[0],arr[1]);
	}
}