import java.util.*;
class SmmallerToRight{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int[] count=new int[n];
		for(int i=0;i<n;i++){
			count[i]=0;
			for(int j=i+1;j<n;j++)
				if(arr[j]<arr[i])
					count[i]++;
		}
		for(int i=0;i<n;i++)
			System.out.print(count[i]+" ");


	}
}