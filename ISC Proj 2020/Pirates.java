import java.util.*;
public class Pirates
{
    String str;
    int n;
    public Pirates()
    {
        str="";
    }
    private boolean isValidChar(char ch)
    {
        return ( "ACEGIK ".indexOf(ch)!=(-1) );
    }
    private boolean isValidCode()
    {
        if(n>6)
        {
           System.out.println("n should be less than 6");
           return false;
        }
        if(str.length()!=n)
        {
           System.out.println("Length of given string not same as value of n");
           return false;
        }
        for(int i=0;i<n;i++)
        {
            if(i!=n-1){
                for(int j=i+1;j<n;j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                       System.out.println("Repitions not allowed");
                       return false;
                    }
                }
            }
            if(Character.isLowerCase(str.charAt(i)))
            {
                System.out.println("Lowercase Characters not allowed");
                return false;
            }
            if(!isValidChar(str.charAt(i)))
            {
                System.out.println("Invalid characters present");
                return false;
             }
        }
        return true;
    }
    public void check()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        System.out.println("Enter code:");
        str=sc.next();
        if(isValidCode())
        {
            System.out.println("Valid!");
        }
    }
    public static void main(String args[])
    {
        Pirates obj=new Pirates();
        obj.check();
    }
}
