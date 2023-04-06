import java.util.*;
class Denominations
{
    int amt, c;
    Denominations()
    {
        c=amt=0;
    }
    public void inputAmount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount in Rupees:");
        amt=sc.nextInt();
        if(amt < 0 ||amt > 99999)
        {
            System.out.println("Invalid Input .........");
            System.exit(0);
        }
    }
    private String Digs(int a)
    {
        String digits[]={"Zero","One",
                        "Two","Three","Four","Five","Six","Seven",
                        "Eight","Nine"};
        String str="";
        int d;
        while(a>0)
        {
            d=a%10;
            str=" "+digits[d]+str;
            a/=10;
        }
        return str.trim();
    }
    private void getDen(int a)
    {
        int k, den=0;
        for(int i=1;i<=9;i++)
        {
            switch(i)
            {
                case 1: den=1000;
                    break;
                case 2: den=500;
                    break;
                case 3: den=100;
                    break;
                case 4: den=50;
                    break;
                case 5: den=20;
                    break;
                case 6: den=10;
                    break;
                case 7: den=5;
                    break;
                case 8: den=2;
                    break;
                case 9: den=1;
                    break;
            }
            if(a/den>0)
            {
                k=a/den;
                System.out.println(den+" X "+(k)+"="+(k*den));
                c+=k;
                a%=den;
             }
        }
    }
    public void display()
    {
        System.out.println(Digs(amt));
        getDen(amt);
        System.out.println("Total no. of notes: "+c);
    }
    public static void main(String args[])
    {
        Denominations obj=new Denominations();
        obj.inputAmount();
        obj.display();
    }
}