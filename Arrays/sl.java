import java.util.Scanner;
import java.util.Arrays;
class LargestSmallest{
	public static void main(String[] args){
		System.out.println("Enter the number of elements");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			arr[i]=reader.nextInt();
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
	}
}