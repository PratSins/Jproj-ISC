import java.util.*;
public class Krishnamurthy
{
    public static void main(String arbs[])
    {
        System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        int n,i,d,f,m,s=0;
        System.out.println("Enter A number:");
        n=sc.nextInt();
        m=n;
        do
        {
            d=m %10;
            f=1;
            for (i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
            m=m/10;
        }
        while (m!=0);
        if (s==n)
        {
            System.out.println("Entered number is Krishnamurthy");
        }
        else
        {
            System.out.println("Entered number is not  Krishnamurthy");
        }
    }    
}        