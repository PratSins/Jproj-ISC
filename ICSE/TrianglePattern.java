import java.util.*;
class TrianglePattern
{
    Scanner sc=new Scanner(System.in);
    int n,sp,i,x,j;
    TrianglePattern()
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
              System.out.print(x+"   ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        TrianglePattern obj=new TrianglePattern();
        obj.clrscr();
        obj.input();
        obj.display();
    }
}
