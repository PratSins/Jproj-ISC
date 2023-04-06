import java.util.*;
class Date
{
    private int year, days, n;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter Day Number: ");
        days = sc.nextInt();
        if (days < 1 || days > 366)
        {
            System.out.println("Days must be between 1 and 366");
            System.exit(0);
        }
        System.out.print("\n Enter Year: ");
        year = sc.nextInt();
        if (year < 1000 || year > 9999)
        {
            System.out.println("Year must be 4 digits");
            System.exit(0);
        }
        System.out.print("\n Enter Day After (N): ");
        n = sc.nextInt();
        if (n < 1 || n > 100)
        {
            System.out.println(" N must be between 1 and 100");
            System.exit(0);
        }
        sc.close();
    }
    
    void display1()
    {
        Calendar c1=Calendar.getInstance();
        c1.set(year, 0, 0);
        System.out.println(c1.getTime());
        c1.add(Calendar.DATE, days);
        System.out.println(c1.getTime());
        c1.add(Calendar.DATE, n);
        System.out.println(c1.getTime());
    }
    
    String suffix(int n)
    {
        switch (n % 10)
        {
            case 1:
                return "ST ";
            case 2:
                return "ND ";
            case 3:
                return "RD ";
            default:
                return "TH ";
        }
    }
    
    void display()
    {
        String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        Calendar c1=Calendar.getInstance();
        c1.set(year, 0, 0);
        
        //Display Date
        c1.add(Calendar.DATE, days);
        System.out.print("GIVEN DATE: ");
        System.out.println(c1.get(Calendar.DATE)+ suffix(c1.get(Calendar.DATE)) + months[c1.get(Calendar.MONTH)] +" "+ c1.get(Calendar.YEAR));
        
        //Display after n days
        c1.add(Calendar.DATE, n);
        System.out.print("DAY AFTER " +n +" DAYS: ");
        System.out.print(c1.get(Calendar.DATE)+ suffix(c1.get(Calendar.DATE)) + months[c1.get(Calendar.MONTH)] +" "+ c1.get(Calendar.YEAR));
    }
    
    public static void main(String[] args)
    {
        Date d=new Date();
        d.accept();
        d.display();
    }
    
}
