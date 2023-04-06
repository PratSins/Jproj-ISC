import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        n=sc.nextInt();
        int d,rem=0,m;
        m=n;
        do 
        {
            d=m%10;
            rem=rem*10+d;
            m=m/10;
        }
        while(m!=0);
        System.out.print("Reversed number is "+rem);
    }
}    