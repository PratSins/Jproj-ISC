import java.util.*;
class Awesome
{
    int size;
    Awesome()
    {
        size=0;
    }
    void getSize()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        size=Math.abs(sc.nextInt());
    }
    void displayPattern()
    {
        int sp=size*(size-1), space, cols, i, j, cl=1;
        for(i=1;i<=size*2-1;i++)
        {
            for(space=1;space<=sp;space++)
            {
                System.out.print(" ");
            }
            if(i<size)
              sp-=3;
            else
              sp+=3;
            for(cols=1;cols<=cl;cols++)
            {
                if(cols==1 || cols==cl)
                    System.out.print("@  ");
                else if(i%2==0)
                    System.out.print("!  ");
                else 
                    System.out.print("*  ");
            }
            if(i<size)
              cl+=2;
            else
              cl-=2;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Awesome obj=new Awesome();
        obj.getSize();
        obj.displayPattern();
    }
}