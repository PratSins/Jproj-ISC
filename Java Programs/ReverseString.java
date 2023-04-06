//Reversing a String:
import java.util.*;
public class ReverseString
{
    public String reverseString(String s)
    {
        int l=s.length();
        String rev="";
        for (int i=l-1; i>=0; i--)
        {
            rev= rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String args[])
    {
       ReverseString ob=new ReverseString();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string:");
       String n=sc.nextLine();
       String rev =ob.reverseString (n);
       System.out.println("Output="+rev);
    }
}
