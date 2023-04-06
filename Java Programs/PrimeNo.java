import java.util.*;
class PrimeNo
{
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n=sc.nextInt();
        int c=2,i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            c=c+1;
        }
        if(c==2)
        System.out.println("The number entered here is prime");
        else
        System.out.println("The number entered here is composite");
    }
}