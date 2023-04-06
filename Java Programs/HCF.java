import java.util.*;
class HCF
{
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two positive integers=");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,p=n*m,gcd=0;
        for(i=1;i<=p;i++)
        {
            if((n%i==0) && (m%i==0))
            gcd=i;
        }
        System.out.print("Highest common factor of the entered");
        System.out.println(" numbers is = "+gcd);
    }
}
