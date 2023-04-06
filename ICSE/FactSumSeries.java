/*
   1!       +        2!       +        3!     +          4!
 --------        -----------         ---------         ---------…………… n terms 
  2!+3!             3!+4!              4!+5!             5!+6!
*/
import java.util.*;
class FactSumSeries
{
    public static void main(String args[])
    {
        System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit of the series:");
        int n=sc.nextInt();
        int i;
        double s=0.00, f=1.00;
        for(i=1;i<=n;i++)
        {
            f*=i;
            s=s+f/(f*((i+1)+(i+1)*(i+2)));
        }
        System.out.println("Sum="+s);
    }
}