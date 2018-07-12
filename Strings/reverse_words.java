import java.util.*;
class WordsReverse{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String src=sc.nextLine();
		String[] arr=src.split(" ");
		String dest="";
		for(int i=arr.length-1;i>=0;i--){
			dest=dest+" "+arr[i];
		}
		System.out.println(dest);
	}
}