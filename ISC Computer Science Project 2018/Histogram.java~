import java.util.*;
class Histogram
{
    int arr[];
    Histogram()
    {
        arr=new int[10];
        for(int i: arr)
          arr[i]=0;
    }
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of numbers u want to enter:");
        int n=sc.nextInt();
        System.out.println("Enter the numbers:");
        int p=0;
        try{
            
             for(int i=1;i<=n;i++)
             {
                 p=sc.nextInt();
                  if(!(p>10 && p<0))
                   arr[p]++;
                  else
                    i--;
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error .... not a digit .....");
            System.exit(0);
        }
    }
    public void display()
    {
        int ht = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (ht < arr[i])
                ht = arr[i];
        }
        for (int i = ht; i > 0; i--)
        {
            for (int j = 0; j < 10; j++)
            {
                if (arr[j] >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++)
            System.out.print(i);
    }
    public static void main(String args[])
    {
        Histogram obj=new Histogram();
        obj.input();
        obj.display();
    }
}