import java.util.*;
public class Pallindrome
{
    String sent;
    Pallindrome(){ sent = ""; }
    public void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a sentence:");
        sent = sc.nextLine().toUpperCase();
        sent = removePuncs(sent);
        sent = eatExcessSpaces(sent);
    }
    public void display()
    {
        String w[] = sent.split(" ", -1);
        int c = 0;
        for(int i = 0 ; i < w.length ; i++ )
        {
            if( isPallin(w[i]) )
            {
                System.out.print(w[i]+ " ");
                c++;
            }
        }
        if( c == 0 )
          System.out.println("\nNO PALINDROMIC WORDS ");
        else
          System.out.println("\nNUMBER OF PALINDROMIC WORDS :  "+c);
    }
    private boolean isPallin(String s)
    {
        if(s.length() == 1)
          return true;
        if(s.length() == 2)
        {
            if(s.charAt(0) == s.charAt(1))
              return true;
            else 
              return false;
        }
        else{
            if( s.charAt(0) != s.charAt(s.length()-1) )
              return false;
            return isPallin(s.substring(1,s.length()-1));
        }
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
        for( int i = 0 ; i < s.length() ; i++ )
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
        Pallindrome obj = new Pallindrome();
        obj.accept();
        obj.display();
    }
}