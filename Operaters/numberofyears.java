import java.util.*;
class NumberOfYears{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutes=sc.nextInt();
		int num_of_hours=minutes/60;
		int num_of_minutes=minutes%60;
		int num_of_days=num_of_hours/24;
		int num_of_remhrs=num_of_hours%24;
		int num_of_years=num_of_days/365;
		int num_of_remdays=num_of_days%365;
		System.out.println("Number of years="+num_of_years);
		System.out.println("Number of days="+num_of_remdays);
		System.out.println("Number of hours="+num_of_remhrs);
		System.out.println("Number of minutes="+num_of_minutes);
	}
}