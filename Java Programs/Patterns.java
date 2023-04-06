import java.io.*;
class Patterns
{
   public void clrscr()
   {
       System.out.print('\u000C');
   }
   public void Pattern1(int n)
   {
       System.out.println("The Pattern is :");
       for (int i = 1; i <= n; i++) 
       {
             for (int j = 1; j <= i; j++) 
             {
               System.out.print("*");

             }
             System.out.println();
       }
       for (int i = n - 1; i >= 1; i--) 
       {
           for (int j = 1; j <= i; j++) 
           {
                System.out.print("*");
           }
           System.out.println();
       } 
   }
   public void Pattern2(int n)
   {
       System.out.println("The Pattern is :");
       for (int i=1;i<=n;i++)
       {
           for (int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
   } 
   public void Pattern3(int n)
   {
       System.out.println("The Pattern is :");
       for (int i=1;i<=n;i++)
       {
           for(int j=i;j<=n;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
   }
   public void Pattern4(int n)
   {
        n=n+2;
        System.out.println("The pattern is ");
        int f=2;
        for (int i=1;i<=n;i++)
        {
           for (int j=1;j<=n;j++)
           {
               if (j<=f)
               {
                   System.out.print(" ");
               }
               else
               {
                   System.out.print("*");
               }
           }
           f=f+1;           
           System.out.println();
        }
   }
   public void Pattern5(int n)
   {
        System.out.println("The pattern is ");
        for (int i=1;i<=n;i++)
        {
           for (int x=1;x<=i;x++)
           {
               System.out.print("*");
           }
           for (int s=1;s<=(n*2)-(i*2);s++)
           {
               System.out.print(" ");
            }
           for (int x=1;x<=i;x++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
   }
   public void Pattern6(int n)
   {
        System.out.println("The pattern is ");
        for (int i=n;i>=1;i--)
        {
           for (int x=1;x<=i;x++)
           {
               System.out.print("*");
           }
           for (int s=1;s<=(n*2)-(i*2);s++)
           {
               System.out.print(" ");
            }
           for (int x=1;x<=i;x++)
           {
               System.out.print("*");
           }
           System.out.println();
        }
   }
   public void Pattern7(int n)
   {
        n=n+2;
        int f=2;;
        System.out.println("The pattern is ");        
        for (int i=1;i<=n;i++)
        {
           for (int j=1;j<=n;j++)
           {
               if (j<=f)
               {
                   System.out.print("");
               }
               else
               {
                   System.out.print("*");
               }
           }
           f=f+1;
           System.out.println();
        }
   }
   public static void main(String args[])throws IOException
   {
       Patterns obj=new Patterns();
       obj.clrscr();
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter the type of Pattern u want:");
       System.out.println("It ranges from 1 to 7");
       int c=Integer.parseInt(in.readLine());
       System.out.println("Enter the no. of rows:");
       int n=Integer.parseInt(in.readLine());
       switch(c)
       {
           case 1:  
                   obj.Pattern1(n);
                   break;
           case 2:
                   obj.Pattern2(n);
                   break;
           
           case 3:  
                   obj.Pattern3(n);
                   break;
           
           case 4:  
                   obj.Pattern4(n);
                   break;  
           
           case 5:  
                   obj.Pattern5(n);
                   break;      
           
           case 6:  
                   obj.Pattern6(n);
                   break;
           
           case 7:  
                   obj.Pattern7(n);
                   break;
           default:     System.out.println("Wrong Input .................");        
       }
       
   }
}    