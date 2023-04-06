/*Program to input name, middle name and surname of a person and 
 print only the initials:*/
import java.io.*;
class InitialsoftheName
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String s=br.readLine();
        String s1=" ";
        s=" "+s;
        int len=s.length();
        char a;
        System.out.print("Initials are:" +s.charAt(0)+".");
        for(int i=0;i<len;i++)
        {
            a=s.charAt(i);
           if(a==' ')
            s1=s1+s.charAt(i+1)+".";
        }
        System.out.print(s1);
    }
}
