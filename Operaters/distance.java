import java.util.*;
import java.lang.Math;
class DistancePoints{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double distance=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		System.out.println(distance);
	}
}