/*Input 10 array element and search one array element is present in the 
 * array element or not(Binary Searching) */
import java.io.*; 
public class binary_search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,ns,f=0,lb=0,ub=9,mid=0;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
            m[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter your searching number=");
        ns=Integer.parseInt(br.readLine());
        
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(m[mid]<ns)
                lb=mid+1;
            if(m[mid]>ns)
                ub=mid-1;    
            if(m[mid]==ns)
             {
                 f=1;
                 break;
             }
        }
            if(f==0)
                System.out.println("your searching number is not found");
                else
                System.out.println("your searching number is found");
        
         
    
    }
}
