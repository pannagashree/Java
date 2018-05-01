import java.util.*;
class Duplicate{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			arr[i]=reader.nextInt();
		Set<Integer> non_dup= new HashSet<Integer>();
		for(int num:arr){
			if(non_dup.add(num)==false)
			{
				System.out.println(num);
			}
		}
	}
}