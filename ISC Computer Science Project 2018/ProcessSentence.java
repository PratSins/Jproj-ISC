import java.util.*;// to get access to Scanner class to get inputs
class ProcessSentence
{
    String s;
    ProcessSentence()
    {
        s="";
    }
    void take()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s=sc.nextLine().trim()+ " ";
    }
    String formWord()
    {
        String nw=""+s.charAt(0);
        for(int i=s.indexOf(' ');i<s.length()-1;i++)
        {
            if (s.charAt(i)==' ')
               nw=nw + s.charAt(++i);
        }
        return nw;
    }
    int countVowels()
    {
        String w="";
        int c=0, cw=0;
        for(int i=0;i<s.length();i++)
        {
            w=w+s.charAt(i);
            if(s.charAt(i)==' ')
            {
                for(int j=0;j<w.length()-1;j++)
                {
                    if(isVowel(w.charAt(j)))
                        cw++;
                }
                if (cw%2==1)
                    c++;
                cw=0;
                w="";
            }
        }
        return c;
    }
    boolean isVowel(char ch)
    {
        return "aeiouAEIOU".indexOf(ch)!=(-1);
    }
    int sumASCII(String word)
    {
        int sum, i;
           for(i=0, sum=0 ; i<word.length(); sum+=(int)word.charAt(i),i++);
        return sum;
    }
    String getMaxASCII()
    {
        String wmx=s.substring(0, s.indexOf(' ')), word="";
        int mx=sumASCII(wmx);
        for(int i=s.indexOf(' ');i<s.length();i++)
        {
            word=(word+s.charAt(i)).trim();
            if(s.charAt(i)==' ')
            {
                if(mx < sumASCII(word))
                {
                    wmx=word;
                    mx=sumASCII(word);
                }
                word="";
            }
        }
        return wmx;
    }
    public static void main(String args[])
    {
        ProcessSentence obj=new ProcessSentence();
        obj.take();
        int cV=obj.countVowels();
        String fW=obj.formWord();
        String gMA=obj.getMaxASCII();
        System.out.println("NO. of words with odd number of vowels="+cV);
        System.out.println("New word formed="+fW);
        System.out.println("Word with Maximum ASCII sum="+gMA);
    }
}