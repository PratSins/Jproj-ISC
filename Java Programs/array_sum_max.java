/*print the sum of array element and max number of the array element */
import java.io.*; 
public class array_sum_max
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,max,sum=0;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
          m[i]=Integer.parseInt(br.readLine());
        }
        max=m[0];
        for(i=0;i<10;i++)
        {
            sum=sum+m[i];
            if(max<m[i])
               max=m[i];
        }
        System.out.println("Max number="+max);
        System.out.println("sum of array element="+sum);
    }
}
