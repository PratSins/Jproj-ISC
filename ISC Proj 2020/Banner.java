import java.util.*;
public class Banner
{
    Banner(){ }
    private int num()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams :");
        int n = sc.nextInt();
        if( n<2 || n>9 )
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        return n;
    }
    public void execute()
    {
        Scanner sc = new Scanner (System.in);
        int n = num();
        String teams[] = new String[n];
        int maxlen = 0;
        System.out.println("Enter teams :");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print("TEAM " +(i+1)+": ");
            teams[i] = sc.nextLine();
            if( teams[i].length() > maxlen )
            {
                maxlen = teams[i].length();
            }
        }
        for(int i=0;i<n;i++)
        {
            if(teams[i].length()<maxlen)
            {
                for(int j=1;j<=(maxlen);j++)
                {
                    teams[i]+=" ";
                }
            }
        }
        for(int i=0;i<maxlen;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(teams[j].charAt(i)+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Banner obj=new Banner();
        obj.execute();
    }
}