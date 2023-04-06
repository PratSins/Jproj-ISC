import java.io.*;
class AmicablePair
{
    public int sumfact(int a)
    {
        int s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
             s=s+i;
        }
        return s;
    }
    public static void main(String args[])throws IOException
    {
        AmicablePair obj=new AmicablePair();
        System.out.print('\u000C');
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter two numbers:");
        int a=Integer.parseInt(in.readLine());
        int b=Integer.parseInt(in.readLine());
        int c=obj.sumfact(a);
        int d=obj.sumfact(b);
        if (d==a && c==b)
           System.out.println("Entered numbers is in amicalble pair");
        else
           System.out.println("Entered numbers is not in amicalble pair");
    }
}