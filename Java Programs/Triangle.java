import java.util.Scanner;
public class Triangle 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 sides of the triangle :");
         System.out.println("Unit is metre(m)");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a==b&&b==c)
        {
            System.out.println("The triangle is equilateral");
        }
        else if (a==b||b==c||c==a)
        {
            System.out.println("The triangle is isoceles");
        }
        else
        {
            System.out.println("The triangle is scalene");
        }
    } 
}    