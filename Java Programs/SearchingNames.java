/**QNO19*/
import java.io.*; 
public class SearchingNames
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,location=0;
        String str;
        boolean p=false;
        String m[]=new String[20]; 
        
        for(i=0;i<20;i++)
        {
            System.out.println("Enter the name in the cell"+(i+1)+":");
            m[i]=br.readLine();
        }
        System.out.println("Enter the name to be searched");
        
         str=br.readLine();
            
        for(i=0;i<20;i++)
        {
            if(m[i].equals(str))
            location=i+1;
            p=true;
        }
        if(p==true)
        System.out.println("The name"+str+"is found at location"+location);
        else
        System.out.println("The name"+str+"is not found at any location");
       
    }
}
        
        
            