import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
class Check{
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
			arr[i]=reader.nextInt();
		System.out.println("Enter the element to be searched:");
		int num=reader.nextInt();
		if(IntStream.of(arr).anyMatch(x->x==num))
			System.out.println("Present");
		else
			System.out.println("Absent");
	}
}