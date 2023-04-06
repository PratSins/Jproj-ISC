import java.util.*;
public class StrTriangle
{
    String str;
    public StrTriangle()
    {
        getStr();
    }
    private void getStr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word:");
        str=sc.next();
        if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            System.out.println("The last and the first character should be same");
            System.exit(0);
        }
    }
    public void display()
    {
        int sp=str.length() - 1;
        int l=str.length();
        int k=1;
        for(int i=0;i<sp;i++)
           System.out.print(" ");
        System.out.println(str.charAt(0));
        sp--;
        for(int i=1;i<l-1;i++)
        {
            for(int j=0;j<sp;j++)
                System.out.print(" ");
            sp--;
            System.out.print(str.charAt(i));
            for(int j=0;j<k;j++)
                System.out.print(" ");
            k+=2;
            System.out.print(str.charAt(l-i-1));
            System.out.println();
        }
        for(int i=0;i<l;i++)
         System.out.print(str.charAt(i)+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        StrTriangle obj=new StrTriangle();
        obj.display();
    }
}