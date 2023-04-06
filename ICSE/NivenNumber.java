import java.io.*;
class NivenNumber
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n, m, s, d;
    NivenNumber()
    {
        n=m=s=d=0;
    }
    void inputData()
    {
        System.out.println("Enter a number :");
        try{
            n=Integer.parseInt(br.readLine());
        }catch(Exception e){ System.out.println(e); }
        m=n;
    }
    void getSumDig()
    {
        while(m>0)
        {
            d = m%10;
            s = s+d;
            m/=10;
        }
    }
    void display()
    {
        if(n%s == 0)
            System.out.println(n+" is a Niven Number.");
        else
            System.out.println(n+" is not a Niven Number."); 
    }
    public static void main(String args[])
    {
        NivenNumber obj=new NivenNumber();
        obj.inputData();
        obj.getSumDig();
        obj.display();
    }
}