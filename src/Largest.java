package day5BasicPgm;
import java.util.Scanner;
public class Largest {

    public static void main(String[] args) {

        double n1 , n2 , n3;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter three numbers:");
      n1=sc.nextDouble();
      n2=sc.nextDouble();
      n3=sc.nextDouble();
        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}