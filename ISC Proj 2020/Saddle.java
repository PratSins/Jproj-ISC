import java.util.*;
class Saddle
{
    int n;
    int arr[][];
    Saddle(int nk)
    {
        if(nk>5)
        {
            System.out.println("Size to be less than 6");
            System.exit(0);
        }
        n=nk;
        arr=new int[n][n];
        initArr(nk);
    }
    private void initArr(int k)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
              arr[i][j]=sc.nextInt();
        }
    }
    public void displayArray()
    {
        System.out.println("Matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
              System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
    public void SaddlePoint() 
    { 
        for (int i = 0; i < n; i++) 
        { 
            int min_row = arr[i][0], col = 0; 
            for (int j = 1; j < n; j++) 
            { 
                if (min_row > arr[i][j]) 
                { 
                    min_row = arr[i][j]; 
                    col = j; 
                } 
            } 
            int k; 
            for (k = 0; k < n; k++) 
            { 
                if (min_row < arr[k][col]) 
                    break; 
            }
            if (k == n) 
            { 
               System.out.println("Value of Saddle Point: " + min_row); 
               return;
            } 
        } 
        
        System.out.println("NO SADDLE POINT");
    } 
    public void dispPrimes()
    {
        System.out.println("Prime elements are:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isPrime(arr[i][j]))
                  System.out.print(arr[i][j]+"  ");
            }
        }
        System.out.println();
    }
    private boolean isPrime(int k)
    {
        if(k<2)
          return false;
        for(int i=2;i<=k/2;i++)
        {
            if(k%i==0)
              return false;
        }
        return true;
    }
    public void sumAboveLeft()
    {
        int s=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                  s+=arr[i][j];
            }
        }
        System.out.println("Sum of elements above left diagonal :"+s);
    }
    private int[] BubbleSort(int m[])
    {
        int k=m.length;
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
                if(m[j]>m[j+1])
                {
                    int t=m[j];
                    m[j]=m[j+1];
                    m[j+1]=t;
                }
            }
        }
        return m;
    }
    public void sortRowWise()
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=BubbleSort(arr[i]);
        }
        displayArray();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int nk=sc.nextInt();
        Saddle obj=new Saddle(nk);
        obj.displayArray();
        obj.SaddlePoint();
        obj.dispPrimes();
        obj.sumAboveLeft();
        obj.sortRowWise();
    }
    
}