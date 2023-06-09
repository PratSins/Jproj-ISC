import java.util.*;
public class Magic
{
    Magic(){}
    public void execute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower and upper limit:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if( m > n )
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        boolean flag = false;
        int c = 0;
        for(int i = m ; i <= n ; i++)
        {
            if(isMagic(i))
            {
                if(!flag)
                {
                    System.out.println("THE COMPOSITE MAGIC INTEGERS ARE  :");
                    flag = true;
                }
                System.out.println(i);
                c++;
            }
        }
        if(!flag)
            System.out.println("NO MAGIC NUMBERS");
        else
            System.out.println("FREQUENCY OF COMPOSITE MAGIC INTEGERS IS :  "+c);
    }
    private boolean isMagic(int num)
    {
        int s = num, d;
        while(s > 9)
        {
            num = s;
            s = 0;
            while( num > 0 )
            {
                d = num % 10;
                s = s + d;
                num = num / 10;
            }
        }
        if( s == 1 )
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Magic obj = new Magic ();
        obj.execute();
    }
}