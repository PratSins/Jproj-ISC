import java.util.*;
class DaysDiff
{
    int isleapYr(int yr)
    {
        int flag=0;
        if(yr%100==0)
        {
            yr/=100;
            if(yr%4==0)
             flag=1;
        }
        else if(yr%4==0)
         flag=1;
        return flag;
    }
    int daysAdd(int mn)
    {
        int nod=0;
        switch (mn)
        {
            case 12: nod+=31;
            case 11: nod+=30;
            case 10: nod+=31;
            case 9: nod+=30;
            case 8: nod+=31;
            case 7: nod+=31;
            case 6: nod+=30;
            case 5: nod+=31;
            case 4: nod+=30;
            case 3: nod+=31;
            case 2:
                    if(isleapYr(mn)==1)
                     nod+=29;
                    else
                     nod+=28;
            case 1: nod+=31;
        }
        return nod;
    }
    int mntype(int mn)
    {
        int nod=0;
        switch (mn)
        {
            case 12:
            case 10:
            case 8: 
            case 7: 
            case 5: 
            case 3: 
            case 1: nod+=31;
                    break;
            case 9:            
            case 6:            
            case 4: 
            case 11: nod+=31;
                    break;
            case 2:
                    if(isleapYr(mn)==1)
                     nod+=29;
                    else
                     nod+=28;
                    break;
        }
        return nod;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
    }
}