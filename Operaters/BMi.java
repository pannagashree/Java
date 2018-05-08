import java.util.*;
class BMI{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height_in_inches=sc.nextDouble();
		double weight_in_pounds=sc.nextDouble();
		double height_in_meters=height_in_inches*0.0254;
		double weight_in_kgs=weight_in_pounds* 0.45359237;
		double bmi=weight_in_kgs/(height_in_meters*height_in_meters);
		System.out.println(bmi);
	}
}