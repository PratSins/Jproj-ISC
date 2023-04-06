import java.util.*;
public class TEST
{
    public static void main(String args[])
    {
        long n=(new Scanner(System.in)).nextInt();
        for(long i=Integer.MAX_VALUE+1;i>0;i/=2)
        {
                      if ((n&i) != 0)
               System.out.print("1 ");
               else
               System.out.print("0 ");
        }
        
    }
}
