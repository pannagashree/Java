import java.util.*;
class CountToken{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String tok=sc.nextLine();
		int lastIndex=0,count=0;
		while(lastIndex!=-1){
			lastIndex=str1.indexOf(tok,lastIndex);
			if(lastIndex!=-1){
				count++;
				lastIndex+=tok.length();
			}
		}
		System.out.println(count);
	}
}