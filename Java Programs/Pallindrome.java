import java.util.Scanner;
public class Pallindrome
{
    public static void main(String args[])
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number :");
        n=in.nextInt();
        int d,rem=0,m;
        m=n;
        do 
        {
            d=m%10;
            rem=rem*10+d;
            m=m/10;
        }
        while(m!=0);
        if (rem==n)
        {
            System.out.println("Entered number is pallindrome");
        }
        else
        {
            System.out.println("Entered number is not pallindrome");
        }
    }
}    
        