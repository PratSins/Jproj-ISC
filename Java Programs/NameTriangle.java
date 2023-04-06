import java.util.*;
public class NameTriangle
{
    public static void main(String args[])
    {
        System.out.print('\u000c');
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word of odd length:");
        String n=sc.next();
        int l=n.length();
        if(l%2==0)
           System.out.println("Wrong Input");
        else
        {
           int s=l;
           for(int i=1;i<=l;i=i+2)
           {
               for(int x=1;x<=s;x++)
                  System.out.print(" ");
               String ch=n.substring(0,i);
               for (int x=0;x<ch.length();x++)
               System.out.print(ch.charAt(x)+" ");
               System.out.println();                   
               s=s-2;
           }
        }
    }
}