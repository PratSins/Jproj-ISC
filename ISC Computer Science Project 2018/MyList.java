import java.util.*;// to get access to Scanner class to get inputs
class MyList
{
    float num[];
    int n;
    MyList(int size)
    {
        n=size;
        num=new float[size];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the list:");
        for(int i=0;i<n;i++)
           num[i]=sc.nextFloat();
    }
    boolean checkPrime(float m)
    {
        for(int i=2;i<=m/2;i++)
        {
            if(m%i==0)
                return false;
        }
        return true;
    }
    int countPrimes()
    {
        int c=0;
        for (int i=0;i<n;i++)
        {
            if(checkPrime(num[i]))
              c++;
        }
        return c;
    }
    void display()
    {
        int numPrimes=countPrimes();
        float temp;
        for (int i=0; i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    flag=true;
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j=1]=temp;
                }
                if(!flag)
                   break;
            }
        }
        System.out.println("Number of prime numbers in the List="+numPrimes);
        System.out.println("\nElements of the List:");
        for(int i=0;i<n;i++) 
           System.out.print(num[i]+"  ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list:");
        int size=sc.nextInt();
        MyList obj=new MyList(size);
        obj.accept();
        obj.display();
    }
}