import java.util.*;
class InsertionSort{
	public static void main(String[] args) {
		int[] arr={90,8,57,89,45};
		int n=arr.length;
		int key;
		for(int i=1;i<arr.length;i++){	//n-1 passes
			key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
					arr[j+1]=arr[j];
					j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		}
	}