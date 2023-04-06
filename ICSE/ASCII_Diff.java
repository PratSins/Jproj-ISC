import java.util.*;
class ASCII_Diff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two characters : ");
        char a=sc.next().charAt(0);
        System.out.println();
        char b=sc.next().charAt(0);
        int s=((int)a)+((int)b);
        int d=(int)a-b;
        System.out.println();
        System.out.println(s);
        System.out.println(d);
    }
}