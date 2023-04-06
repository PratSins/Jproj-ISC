import java.io.*;
class Fascinate
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int i, flag, n;
    String s;
    char c;//for extracting digits
    int a[]=new int[10];//to store frequency of every digit from '0' to '9'
    Fascinate()
    {
        c=0;
        s="";
        for(i=0;i<10;i++)
           a[i]=0;
        i=flag=n=0;
    }
    void read()
    {
        System.out.println("Enter a number atleast 3 digits:");
        try
        {
            n=Integer.parseInt(br.readLine());
        }catch(Exception e){System.out.println(e);}
    }
    boolean isUnique(String q)
    {
        for(i=0; i<q.length(); i++)
        {
            c= q.charAt(i);
            a[c-48]++; 
            /*  increasing A[5] if ch='5' as '5'-48 = 53-48=5 
             *  (ASCII values of '0' to '9' are 48 to 57) */
        }
 
        for(i=1; i<10; i++)
        {
            //checking if every digit from '1' to '9' are present exactly once or not
            if(a[i]!=1)
            {
                flag = 1; //flag is set to 1 if frequency is not 1
                break;
            }
        }
 
        if(flag == 1)
            return false;
        else
            return true;
    }
    void display()
    {
        if(Integer.toString(n).length()<3)
            System.out.println("Number should be of atleast 3 digits.");
 
        else
        {
            s = Integer.toString(n*1) + Integer.toString(n*2) + Integer.toString(n*3);
            /*  Joining the first, second and third multiple of the number
             *  by converting them to Strings and concatenating them*/
            if(isUnique(s))
                System.out.println(n+" is a Fascinating Number.");
            else
                System.out.println(n+" is not a Fascinating Number.");
        }
    }
    public static void main(String args[])
    {
        Fascinate obj=new Fascinate();
        obj.read();
        obj.display();
    }
}