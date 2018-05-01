import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
class Odd{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(s->s)).forEach((k,v)->{if(v.size()%2!=0) System.out.println(k+" "+v.size());});
	}
}