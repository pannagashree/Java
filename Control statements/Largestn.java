import java.util.*;
import java.lang.Math.*;
class LargestN3{
	public static void main(String[] args) {
		int n=1;
		while(Math.pow(n,3)<=12000)
			n++;
		System.out.println(n-1);	
	}
}