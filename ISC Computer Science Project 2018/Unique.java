import java.util.*;
class Unique
{
    int m, n;
    Unique()
    {  m=n=0;   }
    public void accept()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Lower and Upper limit:");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m>n)
         {
             int t=m;
             m=n;
             n=t;
         }  
    }
    private int countDig(int x)
    {
        if(x<10)
         return 1;
        else
         return 1+countDig(x/10);
    }
    private boolean isUnique(int x)
    {
        int k,d;
        while(x>0)
        {
            d=x%10;
            k=x/10;
            while(k>0)
            {
                if(k%10==d)
                  return false;
                  k/=10;
            }
            x/=10;
        }
        return true;
    }
    public void display()
    {
        int c=0;
        System.out.println("The unique-digit numbers are:");
        for(int i=m;i<=n;i++)
        {
            if(isUnique(i))
            {   
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Frequency of Unique-digit numbers: "+c);
    }
    public static void main(String args[])
    {
        Unique obj=new Unique();
        obj.accept();
        obj.display();
    }
}