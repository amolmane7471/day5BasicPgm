package day5BasicPgm;
import java.util.Scanner;
public class FlipCoin{
public static void main(String[] args)
{
	double result,perCentOfHCount,perCentOfTCount;
	int loopCount=0,H_Cnt=0,T_Cnt=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of flips: ");

int n = sc.nextInt();
while(loopCount<n)
{
result=Math.random();
if(result<0.5)
	{System.out.println("Flip is Head"+result);
  H_Cnt++;
  System.out.println(" Head Count"+H_Cnt);
	}
  else
	{System.out.println("Flip is Tail"+result);
T_Cnt++;
System.out.println(" Tail Count"+T_Cnt);
	}
loopCount++;
}
perCentOfHCount=(H_Cnt*100)/n;
System.out.println("percent of head count:"+perCentOfHCount);
perCentOfTCount=(T_Cnt*100)/n;
System.out.println("percent of Tail count:"+perCentOfTCount);
}

} 