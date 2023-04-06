import java.util.*;
class AscendingBubbleSort
{
   static Scanner sc=new Scanner(System.in);
    String arr[]=new String[10];
    int i, t, j;
    AscendingBubbleSort()
    {
        i=t=j=0;
    }
    void clrscr()
    {
        System.out.print('\u000c');
    }
    static void inputData()
    {
        System.out.println("Enter any 10 Integers:");  
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLine();
    }
    void sort()
    {
        for(i=0;i<9;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(arr[j]==arr[j+1])
                {
                    String t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    void display()
    {
        System.out.println("The sorted elements of the array:");
        for(i=0;i<10;i++)
           System.out.print(arr[i]+" ");        
    }
    public static void main(String args[])
    {
        AscendingBubbleSort obj=new AscendingBubbleSort();
        obj.clrscr();
        obj.inputData();
        obj.sort();
        obj.display();
    }
}