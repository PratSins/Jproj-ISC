import java.util.*;
public class SortWords
{
    String sent;
    SortWords(){ sent = ""; }
    public void execute()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence:");
        sent = sc.nextLine().toUpperCase();
        char ch = sent.charAt( sent.length()-1 );
        sent = removePuncs(sent);
        sent = eatExcessSpaces(sent);
        String ns = sort(sent);
        if("?.!".indexOf(ch)!=(-1))
           ns+=ch;
        System.out.println("Sorted Sentence:\n"+ns);
    }
    private String sort(String s)
    {
        String w[] = s.split(" ", -1);
        String ns = "";
        int n =  w.length;
        System.out.println("The length of the sentence is "+n);
        for( int i = 0; i < n-1; i++)
        {
            boolean flag = false;
            for( int j= 0; j < n-1-i; j++)
            {
                if( w[j].compareTo( w[j+1] ) > 0 )
                {
                    flag = true;
                    String t = w[j];
                    w[j] = w[j+1];
                    w[j+1] = t;
                }
            }
            if( !flag )
               break;
        }
        for( int i = 0; i < n; i++)
           ns = ns + w[i] + " ";
        return ns.trim();
    }
    private String removePuncs(String s)
    {
        s = s.trim() + " ";
        String ns = "";
        for(int i=0;i<s.length()-1;i++)
        {
            if(!isPunc(s.charAt(i)))
               ns+=s.charAt(i);
            else{
               if(s.charAt(i+1)!=' ')
                  ns+=" ";
            }
        }
        return ns.trim();
    }
    private boolean isPunc(char ch)
    {
        return "!@#'\",.?".indexOf(ch)!=(-1);
    }
    private String eatExcessSpaces(String s)
    {
        s = s.trim();
        String ns = "";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
               ns += s.charAt(i);
            else
            {
                ns = ns + " ";
                do{
                    ++i;
                } while( s.charAt(i) == ' ' );
                i--;
            }
        }
        return ns;
    }
    public static void main(String args[])
    {
        SortWords obj = new SortWords();
        obj.execute();
    }
}