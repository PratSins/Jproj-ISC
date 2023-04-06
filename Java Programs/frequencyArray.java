/*Write a program in java to accept 20 number in each of two single dimensional 
 * arrays A and B.Find and print the frequency of each element 
 * of array A in array B.*/
import java.io.*; 
public class frequencyArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,j,c=0;
        int a[]=new int[10]; 
        int b[]=new int[10]; 
        System.out.println("Enter the 10 number in the array=");
        for(i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
            b[i]=Integer.parseInt(br.readLine());
        }
                       
        for(i=0;i<10;i++)
        {
            c=0;
            for(j=0;j<10;j++)
            {
                if(a[i]==b[j])
                c++;
            }
           System.out.println("Frequency of:"+a[i]+"is"+c);  
        }
    }
}