import java.io.*;
class Kaprekar 
{
    public static void main(String args[])throws IOException
    {
        System.out.print('\u000C');
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter a number:");
        int n=Integer.parseInt(in.readLine());
        int p=n*n,m=n,c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        int d=(int)Math.pow(10,c);
        int a=p%d;
        int b=p/d;
        if((a+b)==m)
           System.out.println("Entered number is Kaprekar");
        else
           System.out.println("Entered number is not Kaprekar");
    }
}