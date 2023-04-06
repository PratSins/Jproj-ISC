import java.util.*;
class Small
{
    int n, min, min2;
    Small()
    {
        n=0;
        min=min2=10;//min=Integer.MAX_VALUE;
    }
    void getNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number:");
        n=Math.abs(sc.nextInt());
    }
    void getMins()
    {
        int m=n,d=0;
        while(m>0)
        {
            d=m%10;
            if(d<min)
            {
               min2=min;
               min=d;
            }
            m/=10;    
        }
        if (min==min2||min2>9)
          min2=-1;
    }
    void display()
    {
        System.out.println("Smallest digit="+min);
        if (min2!=-1)
          System.out.println("2nd smallest digit="+min2);
        else
          System.out.println("No 2nd smallest");
    }
    public static void main(String args[])
    {
        Small ob=new Small();
        ob.getNum();
        ob.getMins();
        ob.display();
    }
}