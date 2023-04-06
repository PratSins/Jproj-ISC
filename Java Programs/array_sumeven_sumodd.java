/* print The sum of all even and odd number of the array element Separately   */
import java.io.*; 
public class array_sumeven_sumodd
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,even=0,odd=0;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
          m[i]=Integer.parseInt(br.readLine());
        }
       
        for(i=0;i<10;i++)
        {
            if(m[i]%2==0)
               even=even+m[i];
               else
               odd=odd+m[i];
        }
        System.out.println("sum of all even number="+even);
        System.out.println("sum of all odd number="+odd);
    }
}
