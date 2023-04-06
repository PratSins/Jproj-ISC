class SuperPrime
{
    public static void show(int n)
    {
        int k=0,t=0,i,d;
        while (n!=0)
        {
           //d=n%10;
            int c=0;
            for(i=1;i<=n;i++)
            {
               if(n%i==0)
                 c++;
            }
            if(c==2)
             k++;
            t++;
           n=n/10;
        }
        if(k==t)
        {
          System.out.println("Super prime");
        }
        else
        {
            System.out.println("not Super prime");
        }
    }
}