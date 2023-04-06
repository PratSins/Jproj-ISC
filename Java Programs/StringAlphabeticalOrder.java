import java.io.*;
class StringAlphabeticalOrder
{
   public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a text in capital later=");
       String s=br.readLine();
       int i,j,len;
       len=s.length();
       char c;
       int pos=0;
       for( i=65;i<=90;i++)
       {
           for(j=0;j<len;j++)
           {
               c=s.charAt(j);
               if(c==(char)i||c==(char)(i+32))
                System.out.print(c);
           }
       }
   }
}