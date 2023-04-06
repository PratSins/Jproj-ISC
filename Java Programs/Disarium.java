import java.util.*;
public class Disarium
{
    public static void main(String args[])
    {
        System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no.");
        int n=sc.nextInt();
        int m=n,c=0;
        while(m!=0)
        {
            c++;
            m/=10;
        }
        int d;
        double s=0.00;
        m=n;
        while(m!=0)
        {
            d=m%10;
            s=s+Math.pow(d,c);
            c--;
            m=m/10;
        }
        if(s==n)
         System.out.println("Disarium no.");
         else
         System.out.println("not a Disarium no.");
    }
}