/*input to be dd mm yyyy
 * like 12 12 2002 --> 12 dec 2002
 * dont give extra spaces
   */
import java.util.*;
class Days
{
    String a[];int size;
    Days(int n)
    {
        size =n;
        a=new String[n];
    }
    public void displayData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dates dd/mm/yyyy");
        for(int i=0;i<size;i++)
         a[i]=sc.nextLine().trim();
        for(int i=0;i<size;i++)
          getDays(a[i]);
    }
    private int returnDays(int m)
    {
        int n=0;
        switch(m)
        {
            case 1:
                n+=31;
            case 2:
               n+=28;
            case 3:
               n+=31;
            case 4:
               n+=30;
            case 5:
               n+=31;
            case 6:
               n+=30;
            case 7:
               n+=31;
            case 8:
               n+=31;
            case 9:
               n+=30;
            case 10:
                n+=31;
            case 11:
              n+=30;
        }
        return n;
    }
     void getDays(String s)
    {
        int d=0, t=0;;
        int pos=-1,k=-1;
        char c;
        try{
            for(int i=0;i<s.length();i++)
            {
                c=s.charAt(i);
                if(c==' ')
                {
                  int g=pos;
                  pos=i;
                  if(g==-1)
                     k=pos;
                }
                if(pos==i&&k==pos)
                {
                   d=(-1)*Integer.parseInt(s.substring(0,pos));
                }
                if(k!=pos)
                   break;
            }
            t=Integer.parseInt(s.substring(k+1,pos));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error .. read instructions right above the class in source code");
            System.exit(0);
        }
        catch (Exception e2)
        {
            System.out.println("Error .. read instructions right above the class in source code");
            System.exit(0);
        }
        if(t==12 && -d>=25)
           d=359+31+d;
        else if(t==12 && -d<25)
          d=25+d;
           else
          d+=returnDays(t)+25;
        System.out.println(d+ " days until Christmas");
    }
    public static void main(String srgs[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of dates ");
        Days ob=new Days(sc.nextInt());
        ob.displayData();
    }
}