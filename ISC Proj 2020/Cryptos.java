import java.util.*;
class Cryptos
{
    String lines[];
    int n;
    Cryptos()
    {  n=0;   }
    public void getNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        n=sc.nextInt();     
        if(n>10 || n<1)
        {
            System.out.println("Input to be in range 1-10");
            System.exit(0);
        }
    }
    public void getLines()
    {
        Scanner sc=new Scanner(System.in);
        lines=new String[n];
        System.out.println("Now enter the sentences:");
        for(int i=0;i<n;i++)
        {
             while(true)
             {
                 lines[i]=((sc.nextLine()).toUpperCase()).trim();
                 if(isSentence(lines[i]))
                   break;
                 System.out.println("Enter the sentence properly:");
             }
             if(lines[i].charAt(lines[i].length()-1)=='.')
                lines[i]=lines[i].substring(0,lines[i].length()-1);
        }
    }
    private boolean isSentence(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='.')
            {
                if(i!=str.length()-1)
                   return false;
            }
        }
        char ch=str.charAt(str.length()-1);
        if(";:,".indexOf(ch)>(-1))
           return false;
        return true;
    }
    public void encrypt()
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
               lines[i]=addTwo(lines[i]);
            else
               lines[i]=revOrder(lines[i]);
        }
    }
    public void display()
    {
        System.out.println("The encrypted Sentences are:");
        for(int i=0;i<n;i++)
           System.out.println(lines[i]);
    }
    private String addTwo(String str)
    {
        String ns="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='Y')
               ns=ns+'A';
            else if(ch=='Z')
               ns=ns+'B';
            else if(Character.isLetter(ch))
             {
                 ch+=2;
                 ns=ns+ch;
             } 
            else if(Character.isWhitespace(ch))
               ns=ns+" ";
        }
        return ns+".";
    }
    private String revOrder(String str)
    {
        str=str+" ";
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
               c++;
        }
        int k=0;
        String s[]=new String[c];
        String w="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
               w+=str.charAt(i);
            else{
                s[k]=w;
                w="";
                k++;
            }
        }
        w="";
        for(int i=c-1;i>=0;i--)
        {
            w=w+s[i]+" ";
        }
        return w.trim()+".";
    }
    public static void main(String args[])
    {
        Cryptos obj=new Cryptos();
        obj.getNum();
        obj.getLines();
        obj.encrypt();
        obj.display();
    }
}