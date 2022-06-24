package day5BasicPgm;
import java.util.Scanner;
public class HarmonicNum {

	public static void main(String[] args) {
		double n,sum=0.0;
		Scanner sc =new Scanner(System.in);
	System.out.println("enter value for n:");
	     n=sc.nextDouble();
	     for(int i=1;i<=n;i++)
	     {
	    	 sum+=1.0/(double)i;
	     }
	     System.out.println("Nth Harmonic Num:"+sum);
	}

}
