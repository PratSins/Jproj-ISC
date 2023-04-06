import java.io.*; 
public class com_array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,j,k,p=0;
        int a[]=new int[5]; 
        int b[]=new int[5]; 
        int c[]=new int[5]; 
        System.out.println("Enter the 5 number 1st array=");
        for(i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
                     
        }
        System.out.println("Enter the 5 number 2nd array=");
        for(j=0;j<5;j++)
        {
            b[j]=Integer.parseInt(br.readLine());
            
        }
        for(i=0;i<5;i++)
        {
           for(j=0;j<5;j++)
           {  
            if(a[i]== b[j])
            {
                c[p]=a[i];
                
                p++;
            }
           }
        }
        System.out.println("com_array are");
        for(i=0;i<5;i++)
        {
            if(c[i]!=0)
            {
               System.out.println(c[i]);
            }
        }    
    }
}
            