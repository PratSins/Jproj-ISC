/*Write a program to store 20 different name along with correspoding
 *Telephone number. Enter a name from the console and search whether the name is 
 *present or not.If the name is present then display the name along with the phone number, otherwise display an
 *appropriate message using "Linear Search technique" */
import java.io.*; 
public class SearchingNameTelephone
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int i,a=0,f=0;
        String ch,b=" ";
        String name[]=new String[20];
        int n[]=new int[20]; 
       
        for(i=0;i<20;i++)
        {
            System.out.println("Enter the Name=");
            name[i]=br.readLine();
            System.out.println("Enter the Number=");
            n[i]=Integer.parseInt(br.readLine()); 
            System.out.println("--------------------");
        }
        System.out.println("Enter your searching name=");
        ch=br.readLine();
                       
        for(i=0;i<20;i++)
        {
           if(name[i].equals(ch)) 
           {
                 f=1;
                 a=i;
                 b=name[i];
                 
           }
        }
      if(f==0)
      System.out.println("your searching name is not found");   
        else
      System.out.println("The Name is:"+b+" "+"and the Telephone no. is:"+n[a]);
    }
}
