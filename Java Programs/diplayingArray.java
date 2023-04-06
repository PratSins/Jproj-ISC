/*Write a program in java to accept 6 element in array A ,and
 * accept 4 element in array B and produced a third array C,containing
 * all the elements of array A and B.Display the result array.
*/
import java.io.*; 
public class diplayingArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,j,k=0;
        int a[]=new int[6]; 
        int b[]=new int[4];
        int c[]=new int[10];
        System.out.println("Enter the 6 number in the array=");
        for(i=0;i<6;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the 4 number in the array=");
        for(j=0;j<4;j++)
        {
           b[j]=Integer.parseInt(br.readLine());
        }
                          
        for(i=0;i<6;i++)
        {
            c[k]=a[i];
            k++;
        }
        for(j=0;j<4;j++)
        {
            c[k]=b[j];
            k++;
        } 
       System.out.println("All array are=");
        for(i=0;i<10;i++)
        {
          System.out.println(c[i]);
        }
      
    }
}