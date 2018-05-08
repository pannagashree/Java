import java.util.*;
class Volume{
	public static void main(String[] args) {
		final double pi=3.14;
		Scanner sc= new Scanner(System.in);
		double r=sc.nextDouble();
		double l=sc.nextDouble();
		double Area=r*r*pi;
		double Volume=Area*l;
		System.out.println("Area="+Area+" "+"Volume="+Volume);
	}
}