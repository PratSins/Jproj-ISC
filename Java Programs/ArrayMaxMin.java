/* The max and min number of the array element */
import java.io.*; 
public class ArrayMaxMin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,max,min;
        int m[]=new int[10]; 
        
        System.out.println("Enter the 10 number=");
        for(i=0;i<10;i++)
        {
          m[i]=Integer.parseInt(br.readLine());
        }
        max=m[0];
        min=m[0]; 
        for(i=0;i<10;i++)
        {
            if(max<m[i])
               max=m[i];
            if(min>m[i])
               min=m[i];
        }
        System.out.println("Max number="+max);
        System.out.println("Min number="+min);
    }
}
