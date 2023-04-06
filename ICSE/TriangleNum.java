import java.util.*;
class TriangleNum
{
    Scanner sc=new Scanner(System.in);
    int n,sp,i,x,j;
    TriangleNum()
    {
        sp=n=i=x=j=0;
    }
    void clrscr()
    {
        System.out.print('\u000c');
    }
    void input()
    { 
        System.out.print("Enter the number of rows:");
        n=sc.nextInt();
        sp=n*2;
    }
    void display()
    {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sp;j++)
               System.out.print(" ");
            sp-=2;
            for(x=1;x<=i;x++)
              System.out.print(x+" ");
            for(x=i-1;x>=1;x--)
              System.out.print(x+" ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        TriangleNum obj=new TriangleNum();
        obj.clrscr();
        obj.input();
        obj.display();
    }
}