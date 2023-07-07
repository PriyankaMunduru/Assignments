import java.util.Scanner;
import java.util.*;
class Tax
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
     int m = n * 12;
        if (m<250000)
        {
            System.out.println("No Tax");
        }
        else if ((m>=250001) & (m<=500000))
        {
            int a = m - 250000;
            int A = a * (10/100) ;
            System.out.println(A);
        }
        else if ((m>=500001) & (m<=1000000))
        {
            int a = m - 250000;
            int b = a - 500000;
            int B = (b * (20/100)) + 50000;
            System.out.println(B);
        }
        else
        {
            int a = m - 250000;
            int b = a - 500000;
            int c = b - 1000000;
            int C = (c * (30/100)) + 50000 + 200000;
            System.out.println(C);
        }
    }
}
