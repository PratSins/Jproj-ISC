import java.io.*;
class TwinPrime
{
    public int primecheck(int n)
    {
        int c=0,i;
        for(i=1;i<=n;i++)
           if(n%i==0)
             c=c+1;
        return c;        
    }
    public static void main(String args[])throws IOException
    {
       System.out.print('\u000C');
       TwinPrime obj=new TwinPrime();
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter two numbers:");
       int a=Integer.parseInt(in.readLine());
       int b=Integer.parseInt(in.readLine());
       int c=obj.primecheck(a);
       int d=obj.primecheck(b);
       if(c==2 && d==2)
       {
           if(Math.abs(a-b)==2)
              System.out.println("Entered numbers is Twin Prime");
            else
               System.out.println("Entered numbers is not Twin Prime");
       }
       else
         System.out.println("not Twin Prime");
    }
}