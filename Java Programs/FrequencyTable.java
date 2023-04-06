import java.util.*;
public class FrequencyTable
{
    public static void main(String args[])
    {
        System.out.print('\u000c');
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string which should be lower case=");
        String m=sc.nextLine();
        int len=m.length();
        char s;
        for(char i='a';i<='z';i++)
        {
            System.out.print(i+"---->");
            for(int x=0;x<len;x++)
            {
                s=m.charAt(x);
                if(s==i)
                {
                   System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}