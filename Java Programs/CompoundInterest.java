import java.util.*;
public class CompoundInterest
{
    public static void main(String args[])
    {
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal amount=");
        double p=sc.nextDouble();
        System.out.println("Enter The Rate of interest per annum=");
        double r=sc.nextDouble();
        System.out.println("Enter The Number of years=");
        double n=sc.nextDouble();
        double a=p*(Math.pow(1+r/100,n));
        double ci=a-p;
        System.out.println("Coumpound Interest="+ci);
        System.out.println("Amount="+a);
    }
}    