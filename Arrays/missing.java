import java.util.*;
import java.util.stream.IntStream;
//import org.apache.commons.lang3.ArrayUtils;
class Missing{
	public static void main(String[] args) {
		int[] arr=IntStream.range(1,101).toArray();		
		int[] a= new int[arr.length-1]; 
		int n=100;
		System.out.println(n);
		//arr=ArrayUtils.removeElement(arr,arr[(new Random()).nextInt(arr.length)]);
		int ind=new Random().nextInt(arr.length);
		//System.out.println(ind);
		System.arraycopy(arr,0,a,0,ind);
		System.arraycopy(arr,ind+1,a,ind,a.length-ind);
		int sum=n*(n+1)/2;
		//System.out.println(sum);
		for (int i=0;i<(n-1);i++) {
			System.out.print(a[i]+" ");
		}
		for (int i=0;i<(n-1);i++) {
			sum-=a[i];
		}
		System.out.println("\n");
		System.out.println(sum);
	}
}