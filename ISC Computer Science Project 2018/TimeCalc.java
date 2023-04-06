/* input to be hours, mins sec in different lines
 * like 7 \n 12 \n 49
*/
import java.util.*;
class TimeCalc
{
    short ih,im,is,oh,om,os;
    int sec;
    TimeCalc(){    sec=ih=im=is=oh=om=os;   }
    public void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WHAT TIME DID YOU GO TO BED -- HOURS, MINUTES, SECONDS");
        ih=sc.nextShort();
        im=sc.nextShort();
        is=sc.nextShort();
        System.out.println("WHAT TIME DID YOU UP FROM BED -- HOURS, MINUTES, SECONDS");
        oh=sc.nextShort();
        om=sc.nextShort();
        os=sc.nextShort();
        if(isComb(ih,im,is)&&isComb(oh,om,os))
        {
            System.out.println("Invalid input....");
            System.exit(0);
        }
    }
    private boolean isComb(short h,short m, short s)
    {
        if (!(h<=12 && h>=1 && m>=59 && m<=0 && s>=59 && s<=0))
         return false;
        return true;
    }
    public void calcTime()
    {
        if(ih<12)
          sec=(12-ih)*3600;
        else
          sec=12*3600;
        sec+=(oh*3600);
        sec-=(im*60);
        sec+=(om*60);
        sec-=is;
        sec+=os;
        System.out.println("YOU SLEPT FOR "+sec+" SECONDS.");
    }
    public static void main(String args[])
    {
        TimeCalc obj=new TimeCalc();
        obj.getinput();
        obj.calcTime();
    }
}