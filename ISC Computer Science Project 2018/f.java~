import java.util.*;
class FlagPattern
{
    public static void main(String args[])
    {
        //System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of the pattern:");
        int n=sc.nextInt();
        if(n%2==0)
           n--;
        int i, j, h=n/2;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==j || i==h ||j==h || i+j==n-1 || i==n-1 || j==n-1)
                  System.out.print("*  ");
                else
                  System.out.print("   ");
            }
            System.out.println();
        }
        
    }
}