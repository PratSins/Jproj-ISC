import java.util.*;
public class FactSeries
{
    public int fact(int n)
    {
        int x,f=1;
        for (x=1;x<=n;x++)
        f=f*x;
        return f;
    }
    public int sum(int n)
    {
        int s=0,x;
        for (x=1;x<=n;x++)
        s=s+fact(x);
        return s;
    }
    public static void main(String args[])
    {
        FactSeries in= new FactSeries();
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the series:");
        int n = sc.nextInt();
        int s =in.sum(n);
        System.out.println("Sum of the series:"+s);
    }
}    