import java.util.*;
class BSCount{
	static int binarySearch_Count(int []arr,int l,int h,int n){
		if(h>=l){
			int mid=l+(h-l)/2;
			if((mid==l||arr[mid-1]==0)&&(arr[mid]==1))	//For array sorted in ascending order;to find if mid is the first occurence index
				return (n-mid);
			if(arr[mid]==1)
				return binarySearch_Count(arr,l,mid-1,n);
			return binarySearch_Count(arr,mid+1,h,n);
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int c=binarySearch_Count(arr,0,n-1,n);
		System.out.println("Number of 1's = "+Integer.toString(c));
	}
}