import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=1,x,n;
        System.out.print("Enter the number of which u want to find the factorial=");
        n=sc.nextInt();
        for (x=1;x<=n;x++)
        {
            f=f*x;
        }
        System.out.println("Factorial of n="+f);
    }
}    