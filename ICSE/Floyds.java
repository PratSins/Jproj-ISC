import java.util.*;
class Floyds
{
     int n;
     Floyds()
     {
         n=0;
     }
     void getSize()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the triangle:");
         n=sc.nextInt();
     }
     void display()
     {
         int k=(n*(n+1))/2;
         int i, j, p, sp;
         int s=(Integer.toString(k)).length()+1;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<i;j++)
             {
                    System.out.print("      ");
             }
             for(p=1;p<=n-i+1;p++)
             {
                 System.out.format("%6d", k--);
             }
             System.out.println();
         }
     }
     public static void main(String args[])
     {
         Floyds obj=new Floyds();
         obj.getSize();
         obj.display();
     }
}