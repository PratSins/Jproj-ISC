import java.util.*;
public class CirPrime
{
    CirPrime(){ }
    public void execute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n < 1)
        {
            System.out.println("INVALID INPUT.");
            System.exit(0);
        }
        int c = (int)Math.pow(10,countDigs(n) - 1);
        int m = n;
        boolean flag = true;
        while(true)
        {
            m = ((m%c)*10) + (m/c);
            if( m == n )
              break;
            System.out.println(m);
            if(!isPrime(m))
                flag = false;
        }
        if(flag && isPrime(n))
          System.out.println(n+" IS CIRCULAR PRIME");
        else
           System.out.println(n+" IS NOT CIRCULAR PRIME");
    }
    private boolean isPrime(int m)
    {
        if(m<=2)
          return false;
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0)
              return false;
        }
        return true;
    }
    private int countDigs(int n)
    {
        if( n < 10 )
          return 1;
        else{
            return 1 + countDigs(n/10);
        }
    }
    public static void main(String args[])
    {
        CirPrime obj = new CirPrime();
        obj.execute();
    }
}