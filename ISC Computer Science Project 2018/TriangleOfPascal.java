import java.util.*;
import static java.lang.System.*;
/**
 * This program generates Pascal's Triangle of a given size.
 * @author Pratyush Singh, Google's Future CEO
 * @version 1.1 [   1 - 04 - 2018  ,  2 - 04 - 2018   ,  Indian Standard Time ]
 */
public class TriangleOfPascal
{
   int rows , midLen;
   TriangleOfPascal( int rows)
   {
       this.rows = rows ;
       midLen = intLen((rows+2)/2);
   }
   public int factorial(int n)
   {
       if(n==0)
           return 1;
       if(n<0)
           return 0;
       int f=1;
       for(int i=n; i>1 ; f*=i, i--);
       return f;
   }
   public int nCr(int n, int r)
   {
            return factorial(n)/(factorial(r)*factorial(n-r));
   }
   public int intLen(int n)
   {
       int c=0;
       while(n>0)
       {
           c++;
           n/=10;
       }
       return c;
   }
   public void decideAlignment()
   {

   }
}