import java.util.*;
class SumCombinations
{
    int number;
    SumCombinations()
    {
        number=0;
    }
    public void getNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number:");
        number=sc.nextInt();
        if(number <0)
        {
            System.out.println("Number to positive ...");
            System.exit(0);
        }
    }
    public void getCombinations()
    {
        for(int i=1;i<=number/2;i++)
        {
            printCombination(number, i);
        }
    }
    private void printCombination(int n, int l)
    {
        int s=0;
        String str="";
        while(s<n)
        {
            s+=l;
            str=str+l+"+";
            l++;
        }
        if(s==n)
          System.out.println(str.substring(0,str.length()-1));
    }
    public static void main(String args[])
    {
        SumCombinations obj= new SumCombinations();
        obj.getNumber();
        obj.getCombinations();
    }
}