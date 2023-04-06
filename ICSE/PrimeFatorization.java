import java.util.*;
class PrimeFatorization
{
     
    void PrimeFact(int n)
    {
        int i=2, m=0;
        System.out.println("Prime Factors of "+n+" :");
        while(n>1)
        {
            if(n%i==0)
            {
                System.out.println(m);
                n=n/i;
            }
            else
                i++;
        }
    }
    public static void main(String args[])
    {
        PrimeFatorization obj=new PrimeFatorization();
        System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        obj.PrimeFact(n);
    }
}
