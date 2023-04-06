import java.util.*;
public class Wraparound
{
    private int n;
    private Nodew root;
    public Wraparound(int k)
    {
        n = k;
        root = null;
        init();
    }
    private void init()
    {
        int m = n;
        Nodew k = new Nodew(m%10);
        k.setNext(k);
        m /= 10;
        root = k;
        Nodew p = root;
        while(m > 0)
        {
            k = new Nodew(m%10);
            k.setNext(p);
            m /= 10;
            do
            {
                p = p.getNext();
            }while( p.getNext() != root);
            p.setNext(k);
            root = k;
            p = p.getNext();
        }
    }
    public boolean isWraparound()
    {
        boolean flag = true;
        Nodew p = root;
        do
        {
            int d = p.getInfo();
            for(int i=1; i<=d; i++)
            {
                p = p.getNext();
            }
            if(p.getVisits() > 0)
            {
                flag = false;
                break;
            }
            p.incrementVisits();
        }while(p != root);
        p=root;
        do
        {
            if(p.getVisits()<1)
            {
                flag = false;
                break;
            }
            p = p.getNext();
        }while( p != root );
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if( n <= 0 )
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        Wraparound obj = new Wraparound(n);
        if( obj.isWraparound() )
          System.out.print(n+" is a Wraparound number.");
        else
          System.out.print(n+" is NOT a Wraparound number.");
    }
}