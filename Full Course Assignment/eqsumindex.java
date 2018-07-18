import java.util.*;
class EqualSumIndex{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sl=0;
		int sr=0;
		for(int i=1;i<n;i++)
			sr+=arr[i];
		for(int i=1;i<n;i++){
			sl+=arr[i-1];
			sr-=arr[i];
			if(sr==sl){
				System.out.println(i);
				return;
			}
		}
		System.out.println("No such index exists");
	}
}