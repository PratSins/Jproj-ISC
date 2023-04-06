/*Input 10 array element and arrange all array element in assending order
 * using Buble sort */
import java.io.*; 
public class BubleSort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,j,t=0;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
            m[i]=Integer.parseInt(br.readLine());
        }
                       
        for(i=0;i<10;i++)
        {
            for(j=0;j<9;j++)
            {
                if(m[j]>m[j+1])
                {
                    t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        System.out.println("sorted_array are");
        for(i=0;i<10;i++)
        {
             System.out.println(m[i]);
           
        }        
        
         
    
    }
}
