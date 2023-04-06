import java.io.*;
public class DuckNum
{
    public static void main(String args[])throws IOException
    {
        System.out.print('\u000C');
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.print("Enter a number:");
       String n=in.readLine();
       int l=n.length(),c=0,a=0;
       for(int i=0;i<l;i++)
       {
           char ch=n.charAt(i);
           int k=ch;
           if(k>=48 && k<=57)
              c++;
       }
       if(c==l)
       {
           for(int i=0;i<l;i++)
           {
               char ch=n.charAt(i);
               if(ch=='0')
                a++;
           }
           if(a==0)
              System.out.print("It is a duck no.");
           else
               System.out.print("It is not a duck no.");
       }
       else
          System.out.print("Enter a no.");
    }   
}   