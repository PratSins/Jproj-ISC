/*Input 10 array element and search one array element is present in the 
 * array element or not(Linear Searching) */
import java.io.*; 
public class LinearSearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,n,f=0;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
            m[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter your searching number=");
        n=Integer.parseInt(br.readLine());
        
        for(i=0;i<10;i++)
        {
            if(m[i]==n)
                f++;
        }
            if(f==0)
                System.out.println("your searching number is not found");
                else
                System.out.println("your searching number is found");
        
         
    
    }
}
