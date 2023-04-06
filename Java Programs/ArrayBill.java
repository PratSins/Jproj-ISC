import java.io.*; 
public class ArrayBill
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        String name[]=new String[15];
        int tic[]=new int[15]; 
        int i;
        double dis,net;
               
        for(i=0;i<15;i++)
        {
            System.out.println("Enter the Name=");
            name[i]=br.readLine();
            System.out.println("Enter the ticket amount=");
            tic[i]=Integer.parseInt(br.readLine()); 
            System.out.println("--------------------");
        }
         System.out.println("SL.NO.\t NAME \t TICKET CHARGES \t DISCOUNT \t NET AMOUNT");
                 
        for(i=0;i<15;i++)
        {
            if(tic[i]>70000)
            {
                dis=0.18*tic[i];
            }
            else
            if(tic[i]>55001 && tic[i]<=70000 )
            {
                dis=0.16*tic[i];
            }
            else
            if(tic[i]>35001 && tic[i]<=55000 )
            {
                dis=0.12*tic[i];
            }
            else
            if(tic[i]>25001 && tic[i]<=35000 )
            {
                dis=0.10*tic[i];
            }
            else
            {
                 dis=0.02*tic[i];
            }
            net=tic[i]-dis;
            System.out.println((i+1)+"\t"+name[i]+"\t"+tic[i]+"\t"+dis+"\t"+net);
        }
    }
}