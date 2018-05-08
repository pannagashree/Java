import java.util.*;
import java.lang.Math;
class Table{
	public static void main(String[] args) {
		System.out.format("%8s%8s%16s\n","a","b","pow(a,b)");
		for (int i=1;i<=5;i++) {
			System.out.format("%8d%8d%16d\n",i,i+1,(int)Math.pow(i,i+1));
		}
	}
}