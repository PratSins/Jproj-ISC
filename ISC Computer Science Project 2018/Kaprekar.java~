import java.util.*;
class Kaprekar
{
    int p, q;
    Kaprekar()
    {    p=q=0;    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lower and upper limit:");
        p=sc.nextInt();
        q=sc.nextInt();
        if(p>q)
         {
             int t=p;
             p=q;
             q=t;
         }   
    }
    private int countDig(int n)
    {
        if(n<10)
         return 1;
        else
         return 1+countDig(n/10);
    }
    private boolean isKaprekar(int n)
    {
        int x=n*n;
        int d=(int)Math.pow(10,countDig(n));
        int a=x%d;
        int b=x/d;
        if((a+b)==n)
           return true;
        else
           return false;
    }
    public void display()
    {
        System.out.println("The kaprekar numbers are:");
        for(int i=p;i<=q;i++)
        {
            if(isKaprekar(i))
               System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Kaprekar obj=new Kaprekar();
        obj.accept();
        obj.display();
    }
}