import java.util.*;
class SubTotalGratuity{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subtotal= sc.nextInt();
		int gratuity_rate = sc.nextInt();
		double gratuity = subtotal*(gratuity_rate/100.0);
		double total=subtotal+gratuity;
		System.out.println("Sum="+total+" Gratuity="+gratuity);
	}
}