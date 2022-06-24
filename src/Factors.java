package day5BasicPgm;
import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		int n,i;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the num:");
		n=sc.nextInt();
		for( i=1;i*i<=n;i++)
		if(n%i==0)
			System.out.println(" "+i);
	    n=n/i;
	    i=1;
	}

}
