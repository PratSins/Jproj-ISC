import java.util.*;
class Country{
    int popu[], n;
    String country[];
    Country(int size)    {
        n=size;
        popu=new int[n];
        country=new String[n];
    }
    void accept()    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the names and their population of countries:");
        for(int i=0;i<n;i++)        {
            country[i]=sc.next();
            popu[i]=sc.nextInt();
        }
    }
    void arrange()    {
        for(int i=0;i<n;i++)        {
            for(int j=0;j<n-i-1;j++)            {
                if(popu[j]<popu[j+1])
                {
                    int t=popu[j];
                    popu[j]=popu[j+1];
                    popu[j+1]=t;
                    String ts=country[j];
                    country[j]=country[j+1];
                    country[j+1]=ts;
                }
            }
        }
    }
    void display()    {
        System.out.println("Country                         Population");
        System.out.println("-------                         ----------");
        for(int i=0;i<n;i++)
           System.out.println(country[i]+"                               "+popu[i]);
    }
    public static void main(String args[])    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of countries:");
        int k =sc.nextInt();
        Country ob=new Country(k);
        ob.accept();
        ob.arrange();
        ob.display();
    }
}