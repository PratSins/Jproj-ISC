
/*import java.util.*;
public class keith1
  {

   public static void main(String[] args) { 

     Scanner sc = new Scanner( System.in ); 
     System.out.print("Input a number: "); 
     int n = sc.nextInt(); 
     int n1 = n;
     String s = Integer.toString(n);
     int d=s.length();
     int arr[]=new int[n];
     int i, sum; 
     for(i=d-1; i>=0; i--)
     {
         arr[i]=n1 % 10;
         n1=n1/10;
          
     }
      
     i=d; sum=0;
     while(sum<n)
     {
         sum = 0;
         for(int j=1; j<=d; j++)
         {
             sum=sum+arr[i-j];
         }
         arr[i]=sum;
         i++;
     }
 
    if(sum==n)
        System.out.println("Keith Number");
     else
        System.out.println("Not a Keith Number");
    }
}*/
import java.util.*;// to get access to Scanner class to get inputs
class Diamond
{
    int n;
    public Diamond()
    {
        n=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Pattern:");
        n=Math.abs(sc.nextInt());
        /* Math.abs() is used with the input because if the user enters 
         * a negative value then it will automatically become postive*/
    }
    public void display()
    {
        int i=1;
        int spaces=(n*2) - 2, k=(i*2)-1;
        for(;i<=(n*2)-1;i++)
        {
            for(int sp=1;sp<=spaces;sp++)
                System.out.print(" ");     // single space
            for(int x=1;x<=k;x++)
            {
                if(x%2==0)
                  System.out.print("# ");
                else
                  System.out.print("@ ");
            }
            if (i>=n)
            {   
                k-=2;
                spaces+=2;
            }
            else
            {
                k+=2;
                spaces-=2;
            }
            System.out.println();// moving the control to next line
        }
    }
    public static void main(String args[])
    {
        Diamond obj=new Diamond();
        obj.accept();
        obj.display();
    }
}
