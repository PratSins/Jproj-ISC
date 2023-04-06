import java.io.*;
class Neon 
{
    public static void main(String args[])throws IOException
    {
        System.out.print('\u000C');
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number:");
        int n=Integer.parseInt(in.readLine());
        int p=n*n,d,s=0;
        while(p>0)
        {
            d=p%10;
            s=s+d;
            p=p/10;
        }
        if(s==n)
           System.out.println("Entered number is Neon");
        else
           System.out.println("Entered number is not Neon");
    }
}