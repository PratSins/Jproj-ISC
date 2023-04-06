import java.util.*;
class SortWords
{
    String s;
    SortWords()
    {
        s="";
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine().trim() + " ";
    }
    String arrange()
    {
        int size=0, pos=0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
               size++;
        }
        String w="", words[]=new String[size];;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            w=(w+s.charAt(i)).trim();
            if(s.charAt(i)==' ')
            {
                words[k++]=w;
                w="";
            }
        }
        for(int i=0;i<size-1;i++)
        {
            pos=i;
            for(int j=i+1;j<size;j++)
            {
                if(words[pos].compareToIgnoreCase(words[j])>0)
                  pos=j;
            }
            if(i!=pos)
            {
                String t=words[i];
                words[i]=words[pos];
                words[pos]=t;
            }
        }
        String newSentence="";
        for(int i=0;i<size;i++)
           newSentence+=words[i]+" ";
        return newSentence.trim();
    }
    void display()
    {
        System.out.println("Original sentence\n"+s);
        String nSen=arrange();
        System.out.println("New sorted sentence\n"+nSen);
    }
    public static void main(String args[])
    {
        SortWords obj=new SortWords();
        obj.accept();
        obj.display();
    }
}