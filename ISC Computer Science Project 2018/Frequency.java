import java.util.*;
class Frequency
{
    byte n;
    String sentences[];
    String words[];
    Frequency()
    {     n=0;    }
    public void inputNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines :");
        n=sc.nextByte();     
        if(n>4 || n<1)
        {
            System.out.println("Input to be in range 1-4");
            System.exit(0);
        }
    }
    public void inputLines()
    {
        Scanner sc=new Scanner(System.in);
        sentences=new String[n];
        System.out.println("Now enter the sentences:");
        for(int i=0;i<n;i++)
        {
           sentences[i]=((sc.nextLine()).trim()).toUpperCase();
           sentences[i]=eatExcessSpaces(sentences[i]);
        }
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
    private int countWords(String str)
    {
        str=str.trim()+" ";
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
               c++;
        }
        return c;
    }
    public void initArr()
    {
        String fstr="";
        for(int i=0;i<sentences.length;i++)
        {
            for(int x=0;x<sentences[i].length();x++)
            {
                char ch=sentences[i].charAt(x);
                if(" ;,.!?\"".indexOf(ch)==(-1))
                 fstr+=ch;
                else
                 fstr+=" ";
            }
            fstr+=" ";
        }
        fstr=eatExcessSpaces(fstr)+" ";
        String w="";
        int c=countWords(fstr);
        words=new String[c];
        for(int i=0;i<c;i++)
           words[i]="";
        int k=0;
        for(int i=0;i<fstr.length();i++)
        {
            if(fstr.charAt(i)!=' ')
              words[k]=words[k]+fstr.charAt(i);
            else{
              k++;
            }
        }
    }
    public void displayFreq()
    {
        for(int i=0;i<words.length-1;i++)
        {
            boolean flag=false;
            for(int j=0;j<words.length-1-i;j++)
            {
                if(words[j].compareTo(words[j+1])>0)
                {
                    flag=true;
                    String t=words[j];
                    words[j]=words[j+1];
                    words[j+1]=t;
                }
            }
            if(!flag)
                break;
        }
        int f=1;
        System.out.println("Total no.of words:"+words.length);
        System.out.println("Frequency:");
        int i;
        for(i=0;i<words.length-1;i++)
        {
            if(words[i].equals(words[i+1]))
              f++;
            else
            {
                System.out.println(words[i]+"---->"+f);
                f=1;
            }
        }
        System.out.println(words[i]+"---->"+f);
    }
    public static void main(String args[])
    {
        Frequency obj=new Frequency();
        obj.inputNum();
        obj.inputLines();
        obj.initArr();
        obj.displayFreq();
    }
}