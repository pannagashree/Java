import java.util.*;
class NumberOfDaysInMonth{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int y=sc.nextInt();
		int no_of_days=0;
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:no_of_days=31;
					break;
			case 4:
			case 6:
			case 9:
			case 11:no_of_days=30;
					break;
			case 2:if(((y%4==0)&&(y%100!=0))||(y%400==0))
						no_of_days=29;
					else
						no_of_days=28;
					break;
		}
		System.out.println(no_of_days);
	}
}