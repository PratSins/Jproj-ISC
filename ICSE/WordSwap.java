import java.util.*;
class WordSwap
{
    String str, ns;
    WordSwap()
    {
        str=ns="";
    }
    void getSentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        str=sc.nextLine().trim() + " ";
    }
    void formNewSentence()
    {
        int i, c, l=str.length();
        String w1, w2;
        char ch;
        c=0;
        w1=w2="";
        for(i=0; i<l; i++)
        {
            ch=str.charAt(i);
            w1=w1+ch;
            if (ch==' ')
            {
                c++;
                if(c%2!=0)
                {
                    w2=w1;
                }
                else
                {
                    ns=ns+w1+w2;
                    w2="";
                }
                w1="";
            }
        }
        ns=ns+w2;
    }
    void displayNewSentence()
    {
        System.out.println("New Sentence=\t"+ns);
    }
    public static void main(String args[])
    {
        WordSwap obj = new WordSwap();
        obj.getSentence();
        obj.formNewSentence();
        obj.displayNewSentence();
    }
}