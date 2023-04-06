import java.io.*;
class TwiistedPrime
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
       TwiistedPrime obj=new TwiistedPrime();
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter a number:");
       int n=Integer.parseInt(in.readLine());
       int m=n,rem=0,d;
       do 
       {
          d=m%10;
          rem=rem*10+d;
          m=m/10;
       }
       while(m!=0);
       int c=obj.primecheck(n);
       int e=obj.primecheck(rem);
       if(c==2 && e==2)
            System.out.println("Entered number is TwiistedPrime");
        else
           System.out.println("Entered number is not TwiistedPrime");
    }
}
       