import java.util.*;
public class DOB
{
    int d, m, y;
    DOB()
    {
        System.out.println();
        accept();
        check();
    }
    private void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Date Of Birth : ");
        d = sc.nextShort();
        m = sc.nextByte();
        y = sc.nextInt();
    }
    private void check()
    {
        boolean flag=true; 
        // Considering that the given date is correct
        if( y < 0 || m <1 || d < 1)
         flag = false;
        if( m == 1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 )
        {
            if( d > 31 )
              flag = false;
        }
        if( m == 4 || m==6 || m==9 || m==11 )
        {
            if( d > 30 )
              flag = false;
        }
        if( m == 2)
        {
            if( isLeapYear(m) )
            {
                if( d > 29 )
                 flag = false;
            }
            else{
                if( d > 28 )
                 flag = false;
            }
        }
        if( m > 12 )
          flag = false;
        if( flag )
        {
            System.out.println("Valid Date.");
            System.out.println("Day Number of the year :" + countDays());
        }
        else
            System.out.println("Invalid Date.");
    }
    private int countDays()
    {
        int n = d;
        switch( m )
        {
            case 1: n+=0; break;
            case 2: n+=31; break;
            case 3: n+=59; break;
            case 4: n+=90; break;
            case 5: n+=120; break;
            case 6: n+=151; break;
            case 7: n+=181; break;
            case 8: n+=212; break;
            case 9: n+=243; break;
            case 10: n+=273; break;
            case 11: n+=304; break;
            case 12: n+=334; break;
        }
        if( isLeapYear(y) && m > 2 )
          n++;
        return n;
    }
    private boolean isLeapYear(int n)
    {
        if(n % 100 == 0)
          n/=100;
        if(n % 4 == 0)
           return true;
        return false;
    }public static void main(String args[])
    {
        DOB obj = new DOB();
    }
}