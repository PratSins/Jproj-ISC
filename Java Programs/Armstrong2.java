import java.util.Scanner;
public class Armstrong2
{   // type 2
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which u want to find the armstrong :");
        int n=sc.nextInt();
        int m=n,d,s=0;
        do 
        {
            d=m%10;
            s=s+(d*d*d);
            m=m/10;
        }
        while(m!=0);
        if (s==n)
        {
            System.out.println("Entered number is  Armstrong");
        }
        else
        {
            System.out.println("Entered number is not  Armstrong");
        }
    }    
}        
        