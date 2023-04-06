import java.util.Scanner;
public class DiscountHunt
{
    public static void main(String args[])
    {
        int purchase;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the purchase value(Rs.) :");
        purchase=sc.nextInt();         
        double discount=0,sp=0;
        {  
         if (purchase<=2000)
            {
            discount=purchase*7/100;
            sp=purchase-discount;
            }
            else
         if (purchase>2000 && purchase>=5000)
            {
            discount=purchase*13/100;
            sp=purchase-discount;
            }
            else
          if (purchase>5000)
            {
            discount=purchase*17/100;
            sp=purchase-discount;
            }   
        }
         System.out.println("Discount=Rs."+discount);
         System.out.println("Selling Price=Rs."+sp);
    }
}    