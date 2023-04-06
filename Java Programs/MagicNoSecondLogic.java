import java.util.*;
class MagicNoSecondLogic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number:");
        int n=sc.nextInt();
        int s=n,d,m=n;
        
        while(s>9)
        {
            n=s;
            s=0;
            while(n>0)
            {
                d=n%10;
                s=s+d;
                n=n/10;
            }
        }
        if(s==1)
            System.out.println(m+" is a magic number");
        else
            System.out.println(m+" is not a magic number");
    }
}