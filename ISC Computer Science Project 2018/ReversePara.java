import java.util.*;
class ReversePara
{
    String lines[];
    String reverse;
    int n;
    ReversePara()
    {
        n=0;
        reverse="";
    }
    public void inputNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        n=sc.nextInt();     
        if(n>20 || n<1)
        {
            System.out.println("Illegal input .... .... ....");
            System.out.println("Input to be in range 1-20");
            System.exit(0);
        }
    }
    public void inputLines()
    {
        Scanner sc=new Scanner(System.in);
        lines=new String[n];
        int c=0;
        System.out.println("Now enter the sentences:");
        for(int i=0;i<n;i++)
        {
           do{
                c=0;
                lines[i]=sc.nextLine();
                for(int j=0;j<lines[i].length();j++)
                {
                    if(lines[i].charAt(j)!=' ')
                        c++;
                }
              }while(c>80);
           lines[i]=eatExcessSpaces(lines[i]);
        }
    }
    public void reverseLines()
    {
        for(int i=0; i<n/2;i++)
        {
            String t=lines[i];
            lines[i]=lines[n-i-1];
            lines[n-i-1]=t;
        }
        for(int i=0; i<n;i++)
        {
            reverse=reverse+revOrder(lines[i])+" ";
        }
        reverse=removePunc(reverse.trim());
    }
    public void display()
    {
        System.out.println("\n"+reverse);
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
        return w.trim();
    }
    private String removePunc(String str)
    {
        String ns="";
        for(int i=0;i<str.length();i++)
        {
            if (!isPunc(str.charAt(i)))
               ns=ns+str.charAt(i);
        }
        return ns;
    }
    private boolean isPunc(char ch)
    {
        return "'.,;:\"".indexOf(ch)!=(-1);
    }
    private String eatExcessSpaces(String str)
    {
        String ns="";
        str=str.trim();
        for(int i= 0; i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
               ns=ns+str.charAt(i);
            else  
               {
                   char ch;
                   do{
                       ch=str.charAt(++i);
                    }while(ch==' ');
                    --i;
                    ns+=" ";
                }
        }
        return ns;
    }
    public static void main(String args[])
    {
        ReversePara obj=new ReversePara();
        obj.inputNum();
        obj.inputLines();
        obj.reverseLines();
        obj.display();
    }
}