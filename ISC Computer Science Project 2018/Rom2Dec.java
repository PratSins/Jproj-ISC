import java.util.*;
public class Rom2Dec
{
    String rom;
    int dec;
    public Rom2Dec(String s)
    {
        dec=0;
        rom=s;
    }
    private int value(char r)
    {
        if (r == 'I')
            return 1;
        else if (r == 'V')
            return 5;
        else if (r == 'X')
            return 10;
        else if (r == 'L')
            return 50;
        else if (r == 'C')
            return 100;
        else if (r == 'D')
            return 500;
        else if (r == 'M')
            return 1000;
        return -99;
    }
    public void R2D()
    {
        int d1, d2;
        for (int i=0; i<rom.length(); i++)
        {
            d1 = value(rom.charAt(i));
            if (i+1 <rom.length())
            {
                d2 = value(rom.charAt(i+1));
                if (d1 >= d2)
                {  dec = dec + d1;   }
                else
                {
                    dec = dec + d2 - d1;
                    i++; 
                }
            }
            else
            {
                dec = dec + d1;
                i++;
            }
        }
    }
    public void display(){
        System.out.println("Decimal equivalent of "+rom+" is "+dec);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a roman number:");
        Rom2Dec obj = new Rom2Dec(sc.next().toUpperCase());
        obj.R2D();
        obj.display();
    }
}