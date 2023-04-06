/*Input 15 array element and arrange all array element in assending order
 * using selection sort */
import java.io.*; 
public class selection_sort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,j,t=0,min=0;
        int m[]=new int[15]; 
        
        System.out.println("Enter the 15 number=");
        for(i=0;i<15;i++)
        {
            m[i]=Integer.parseInt(br.readLine());
        }
                       
        for(i=0;i<15;i++)
        {
            min=i;
            for(j=i+1;j<15;j++)
            {
                if(m[j]<m[min])
                
                    min=j;
            }
                    t=m[i];
                    m[i]=m[min];
                    m[min]=t;
                
        }
        System.out.println("assending order sorted_array are ");
        for(i=0;i<15;i++)
        {
             System.out.println(m[i]);
           
        }        
        
         
    
    }
}
