import java.util.Scanner;
public class Armstrong
{   
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of which u want to find the armstrong :");
        for(int n=126;n<=161;n++)
        {int m=n,d,s=0;
        do 
        {
            d=m%10;
            s=s+(d*d*d);
            m=m/10;
        }
        while(m!=0);
        if (s==n)
        {
            System.out.println(n);
        }
        }
    }    
}        
        