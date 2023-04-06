/*Write aprogram to perform binary_search on a list of integers given below: 
 * to search for an element, input a number by the user. if it is found then 
 * display the element along with the position, otherwise display the message 
 * "search not found" */
import java.io.*; 
public class binarysearch1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,ns,f=0,lb=0,ub=9,mid=0;
        int m[]={5,7,9,11,15,20,30,45,89,97}; 
             
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
