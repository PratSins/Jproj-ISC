import java.util.*;
class Smith
{
    int x, y;
    public Smith()  {   x=y=0;  }
    public void storeNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limits : ");
        x=sc.nextInt();
        y=sc.nextInt();
        if (x>y)
        {
            int t=x;
            x=y;
            y=t;
        }
    }
    public void findSmithNums()
    {
        boolean flag =false;
        for(int i=x;i<=y;i++)
        {
            if(isSmith(i))
            {
                if(!flag)
                   {
                       System.out.println("Smith numbers are :");
                       flag=true;
                    }
                System.out.println(i);    
            }
        }
        if(!flag)
           System.out.println("Sorry .... no Smiths");
    }
    private int sumDig(int k)
    {
        int s=0;
        while(k>0)
        {
            s=s+(k%10);
            k/=10;
        }
        return s;
    }
    private int sumPrimeFact(int n)
    {
        int i=2, s=0;
        while(n>1)
        {
            if(n%i==0)
            {
                s=s+sumDig(i); 
                n=n/i;
            }
            else
                i++;
        }
        return s;
    }
    private boolean isSmith(int n)
    {
        if (sumPrimeFact(n)==sumDig(n))
           return true;
        else 
           return false;
    }
    public static void main(String args[])
    {
        Smith obj=new Smith();
        obj.storeNum();
        obj.findSmithNums();
    }
}