package day5BasicPgm;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		int n,i=0,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value For n:");
		n=sc.nextInt();
		System.out.println("powers of 2 that are less than 2^" +n);
		while(i<=n)
		{
			pow=pow*2;
			System.out.println("2^" +i+ "=" + pow);
		i++;
		}
	}
}