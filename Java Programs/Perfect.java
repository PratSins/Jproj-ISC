
import java.util.Scanner;
public class Perfect
{
    public static void main(String args[])
    {
     int n;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number :");
     n=sc.nextInt();
     int d,s=0,m,c=0,i;
     m=n;
     for(i=1;i<m;i++)
     {
        if (m%i==0)
        s=s+i;
     } 
     if (s==n)
        {
            System.out.println("Entered number is perfect");
        }
        else
        {
            System.out.println("Entered number is not perfect");
        }
    }
}    
        