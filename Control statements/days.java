import java.util.*;
class Days{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 0-6:");
		int day=sc.nextInt();
		System.out.println("Enter the number of days for a future day:");
		int ndays=sc.nextInt();
		int d=(day+ndays)%7;
		switch(d){
			case 0:System.out.println("Sunday");
					break;
			case 1:System.out.println("Monday");
					break;
			case 2:System.out.println("Tuesday");
					break;
			case 3:System.out.println("Wednesday");
					break;
			case 4:System.out.println("Thrusday");
					break;
			case 5:System.out.println("Friday");
					break;
			case 6:System.out.println("Saturday");
					break;
		}
	}
}