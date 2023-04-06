import java.util.*;
class Objects
{
    Scanner sc=new Scanner(System.in);
    int n,m,a,o;
    void calculatetype()
    {
        System.out.print('\u000C');
        System.out.println("What u want to do:");
        System.out.println("\n\n1. Addition\n2. Substraction\n3. Multiplication\n4. Division");
        n=sc.nextInt();
        if(n>4)
        System.out.println("Wrong input given. Please re-run the void");
        else
        System.out.println("Everything is fine. Goto the inputdata void.");
    }
    void inputdata()
    {
        System.out.println("Enter any two integers:");
        m=sc.nextInt();
        a=sc.nextInt();
        System.out.println("Everything is fine. Goto the calculatedata void.");
    }
    void calculatedata()
    {
        switch(n)
        {
            case 1:
            o=m+a;
            break;
            case 2:
            o=m-a;
            break;
            case 3:
            o=m*a;
            break;
            case 4:
            o=m/a;
            break;
            default:
            System.out.println("Wrong input in the calculatetype void");
            o=0;
        }
        System.out.println("Everything is fine. Goto the display void.");
    }
     void display()
    {
        System.out.println("Output="+o);
    }
}