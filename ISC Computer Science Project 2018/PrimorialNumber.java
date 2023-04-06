import java.util.*;
class PrimorialNumber
{
    int n;
    PrimorialNumber()
    {
        n=0;
    }
    boolean checkPrime(int x)
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    boolean checkArmstrong(int x)
    {
        int m=x,d,s=0;
        do 
        {
            d=m%10;
            s=s+(d*d*d);
            m=m/10;
        }
        while(m!=0);
        if (s==x)
           return true;
        else
           return false;
    }
    int printPrimorial()
    {
        int prod=1;
        for(int i=2;i<=n;i++)
        {
            if(checkPrime(i))
             prod*=i;
        }
        System.out.println("Primorial of "+n+" is "+prod);
        return prod;
    }
    public static void main(String args[])
    {
        PrimorialNumber obj=new PrimorialNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        obj.n=sc.nextInt();
        int pP=obj.printPrimorial();
        if(obj.checkArmstrong(pP))
             System.out.println("The primorial of "+obj.n+" is an Armstring number");
        else
             System.out.println("The primorial of "+obj.n+" is not an Armstring number");
    }
}