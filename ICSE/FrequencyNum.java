import java.util.*;
class FrequencyNum
{
    Scanner sc=new Scanner(System.in);
    int d,dc,i;
    long n, m;
    FrequencyNum()
    {
        m=n=i=d=dc=0;
    }
    void clrscr()
    {
        System.out.print('\u000c');
    }
    void read()
    {
        System.out.println("Enter a number: ");
        n=sc.nextLong();
    }
    void display()
    {
        for(i=0;i<=9;i++)
        {
            m=n;
            while(m>0)
            {
                d=(int)m%10;
                if(d==i)
                 dc++;
                m/=10;
            }
            if(dc>0)
               System.out.println(i+"-->"+dc);
            dc=0;   
        }
    }
    public static void main(String args[])
    {
        FrequencyNum obj=new FrequencyNum();
        obj.clrscr();
        obj.read();
        obj.display();
    }
}