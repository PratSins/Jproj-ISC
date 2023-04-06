import java.util.*;
class Cross
{
    Scanner sc=new Scanner(System.in);
    int n, m, rev, d, c, i, j, sp;
    Cross()
    {
        n=m=rev=d=c=i=j=sp=0;
    }
    void clrscr()
    {
        System.out.print('\u000c');
    }
    void readData()
    {
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        m=n;
        while(m>0)
        {
            d=m%10;
            rev=rev*10+d;
            m/=10;
            c++;
        }
        sp=(c/2) + 1;
    }
    void displayCross()
    {
        m=n;
        if(n>0 && c%2!=0)
        {
            for(i=1;i<=c;i++)
            {
                if(i==sp)
                {
                    System.out.println(n);
                    rev/=10;
                }
                else
                {
                    for(j=1;j<=sp-1;j++)
                       System.out.print(" ");
                    d=rev%10;
                    System.out.println(d);
                    rev/=10;
                }
            }
        }
        else
        {
            System.out.println("Error .......");
        }
    }
    public static void main(String args[])
    {
        Cross obj=new Cross();
        obj.clrscr();
        obj.readData();
        obj.displayCross();
    }
}