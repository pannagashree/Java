import java.util.*;
class Divisible{
	public static void main(String[] args) {
		int c=0;
		for(int i=100;i<=1000;i++)
			if(i%5==0 && i%6==0)
			{
				System.out.print(i+" ");
				c++;
				if(c==10){
					c=0;
					System.out.println();
				}

			}
	}
}