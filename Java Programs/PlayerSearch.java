  /**QNO20*/
import java.io.*; 
public class PlayerSearch
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,k=0;
        String name[]=new String[20];
        String cnt[]=new String[20]; 
        int n[]=new int[20];
        char chr;
        
        for(i=0;i<20;i++)
        {
            System.out.println("Enter the player's name,country's name and no. of centuries");            
            name[i]=br.readLine();
            cnt[i]=br.readLine();
            n[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("Enter first character of county's name="); 
        chr=(char)br.read();
        
        for(i=0;i<20;i++)
        {
         if(chr==cnt[i].charAt(0))
         {
             System.out.println(cnt[i]+"\t"+name[i]+"\t"+n[i]); 
             k=1;
          }
          else
          k=0;
        }
        if(k==0)
          System.out.println("Search unsuccessful, Name not enlisted"); 
        }
    }