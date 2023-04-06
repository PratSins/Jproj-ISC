import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int purchase,time;
        System.out.print("Enter the purchase value(Rs.) :");
        purchase=sc.nextInt();
         System.out.print("Enter the time (in yrs):");        
        time=sc.nextInt();
         System.out.print("Enter the Rate (in %):");  
         float r=sc.nextInt();
        double si=0,a=0;
        si=(purchase*r*time)/100;
        a=si+purchase;
        System.out.println("Simple Interest=Rs."+si);
        System.out.println("Amount=Rs."+a);
    }    
}        