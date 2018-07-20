import java.util.*;
class StringToInt{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] carr=str.toCharArray();
		int zeroAscii=(int)'0';
		//System.out.println(zeroAscii);
		int sum=0;
		for(int i=0;i<carr.length;i++){
			int tempAscii=(int)carr[i];
			sum=sum*10+(tempAscii-zeroAscii);
			/*System.out.printf("%c %d %d",carr[i],tempAscii,sum);
			System.out.println();*/
		}
		System.out.println(sum);
	}
}