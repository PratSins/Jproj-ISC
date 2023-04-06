import java.io.*;
class ComMagic
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n, m, i, x, d;
    ComMagic()
    {
        i=m=n=x=d=0;
    }
    void readData()
    {
        System.out.println("Enter the lower limit and upper limit:");
        try
        {
            m=Integer.parseInt(br.readLine());
            n=Integer.parseInt(br.readLine());
        }catch(Exception e){System.out.println(e);}
    }
    boolean isComposite(int k) // Function to check for Composite number
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(k%i==0)
                count++;
        }
        if(count>2)
            return true;
        else
            return false;
    }
    int sumDig(int k) // Function to return sum of digits of a number
    {
        int s = 0;
        while(k>0)
        {
            s = s + k%10;
            k = k/10;
        }
        return s;
    }
    boolean isMagic(int k) // Function to check for Magic number
    {
        int a = sumDig(k);
        while(a>9)
        {
            a = sumDig(a);
        }
        if(a == 1)
            return true;
        else
            return false;
    }
    void getData()
    {
        if(m<=n)
        {
            System.out.println("The Composite Magic Integers are: ");
            for(i=m; i<=n; i++)
            {
                if(isComposite(i) && isMagic(i))
                {
                    if (x==0) // Printing the first number without any comma
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                    x++;
                }
            }
            System.out.println("\nThe frequency of Composite Magic Integers is : "+x);
        }
        else
            System.out.println("INVALID INPUT");
    }
    public static void main(String args[])
    {
        ComMagic obj=new ComMagic();
        obj.readData();
        obj.getData();
    }
}