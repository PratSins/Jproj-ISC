import java.util.*;
class NameFlag
{
    public static void main(String args[])
    {
        //System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name for the pattern:");
        String s=sc.next();
        int n=s.length();
        if(n%2==0)
           n--;
        int i, j, h=n/2;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==j || i==h ||j==h || i+j==n-1 || i==n-1 || j==n-1)
                  System.out.print(s.charAt(j)+"  ");
                else
                  System.out.print("   ");
            }
            System.out.println();
        }
        
    }
}