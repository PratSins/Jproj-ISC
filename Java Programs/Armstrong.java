import java.util.Scanner;
public class Armstrong
{   // type 1
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of which u want to find the armstrong :");
        int n=sc.nextInt();
        int q=n,c=0,d;
        do 
        {
            d=q%10;
            c=c+1;
            q=q/10;
        }
        while(q!=0);        
        int m;
        double s=0;
        m=n;
        do 
        {
            d=m%10;
            s=s+(Math.pow(d,c));
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
        