import java.io.*;
class Series
{
    public void series1(int n)
    {
        int i,j=0,x=1;
        for (i=1;i<=n;i++)
        {
            System.out.print(x+",");
            j=j+1;
            x=x+j;
        }
    }
    public void series2(int n)
    {
        int j,i,x=1;
        for (i=1;i<=n;i++)
        {
            j=x;
            x=(x*x*x)-1;
            System.out.print(x+",");
            x=j+1;
        }
    }
    public void series3(int n)
    {
       int i,f,s=0,x;
       for (i=1;i<=n;i++)
       {
           f=1;
           for(x=1;x<=i;x++)
           {
               f=f*x;
           }
           System.out.print(i+"!+");
           s=s+f;
       }    
       System.out.println("="+s);
    }
    public void series4(int n)
    {
        int f=1,s=1,p=0,t;
        p=p+f+s;
        System.out.print("1+1");
        for(int i=3;i<=n;i++)
        {
            t=f+s;
            p=p+t;
            System.out.print("+"+t);
            f=s;
            s=t;
        }
        System.out.print("="+p);
    }
    public void series5(int n)
    {
        int k=-1,s=0;
        for(int i=2;i<=n;i=i+2)
        {
            k=k*k;
            if(k>0)
            {
                System.out.print(i+"-");
            }
            if(k<0)
            {
               System.out.print(i+"+"); 
            }
            s=s+(i*k);
        }
        System.out.println("0 ="+s);
    }
    public void series6(int n)
    {
        System.out.print('\u000c');
        int s=0;
        for(int i=1;i<=n;i++)
        {
            int k=i+1;
            System.out.print("("+i+"*"+k+")+");
            s=s+(i*k);
        }
        System.out.println("0="+s);
    }
    public void series7(int n)
    {
        int s=0,p=0;
        for(int i=1;i<=n;i++)
        {
            p=p+i;
            s=s+p;
        }
        System.out.print("Sum="+s); 
    }
    public void series8(int n)
    {
        int s=0,p=0;
        for(int i=1;i<=n;i++)
        {
            s=s+i+(i*(i+1));
        }
        System.out.print("Sum="+s); 
    }
    public static void main(String args[])throws IOException
    {
       Series obj=new Series();
       System.out.print('\u000C');
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("Enter the type of Series u want:");
       System.out.println("It ranges from 1 to 7");
       int c=Integer.parseInt(in.readLine());
       System.out.println("Enter the no. of limit:");
       int n=Integer.parseInt(in.readLine());
       switch(c)
       {
           case 1:  
                   obj.series1(n);
                   break;
           case 2:
                   obj.series2(n);
                   break;
           
           case 3:  
                   obj.series3(n);
                   break;
           
           case 4:  
                   obj.series4(n);
                   break;  
           
           case 5:  
                   obj.series5(n);
                   break;      
           
           case 6:  
                   obj.series6(n);
                   break;
           
           case 7:  
                   obj.series7(n);
                   break;
           default:     System.out.println("Wrong Input .................");        
       }
       
    }
}  